package org.mcupdater.curseconsumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.mcupdater.curseconsumer.curse.*;
import org.mcupdater.project.Downloadable;
import org.mcupdater.project.ProjectData;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			Properties properties = new Properties();
			File propFile = new File("CurseConsumer.properties");
			if (propFile.exists()) {
				properties.load(new FileReader(propFile));
			} else {
				properties.setProperty("username","changeme");
				properties.setProperty("password","changeme");
				properties.store(new FileWriter(propFile),"");
				System.out.println("You will need to set the username and password in " + propFile.getAbsolutePath());
				System.exit(1);
			}
			Login login = new Login(properties.getProperty("username"),properties.getProperty("password"));
			CloseableHttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost("https://logins-v1.curseapp.net/login");
			StringEntity stringEntity = new StringEntity(gson.toJson(login));
			post.setEntity(stringEntity);
			post.setHeader("Content-Type", "application/json");
			HttpResponse response = client.execute(post);
			AuthResponse auth = gson.fromJson(new InputStreamReader(response.getEntity().getContent(),"UTF8"), AuthResponse.class);
			List<Project> projects = new ArrayList<>();
			int i = 0;
			while(true) {
				HttpGet get = new HttpGet("https://addons-v2.forgesvc.net/api/addon/search?gameId=432&sectionId=6&index=" + i * 1000 + "&pageSize=1000");
				get.setHeader("AuthenticationToken", auth.getSession().getToken());
				HttpResponse getResponse = client.execute(get);
				Project[] page = gson.fromJson(new InputStreamReader(getResponse.getEntity().getContent(), "UTF-8"), Project[].class);
				for (int index = 0; index < page.length; index++) {
					projects.add(page[index]);
				}
				System.out.println("Records returned: " + page.length);
				if (page.length < 500) {
					break;
				} else {
					i++;
				}
			}
			System.out.println("Total projects: " + projects.size());
			System.out.println("======");
			List<ProjectData> mods = new ArrayList<>();
			long time = System.currentTimeMillis();
			for(Project project : projects) {
				ProjectData projectData = new ProjectData();
				projectData.setName(project.getName());
				for (Author feedAuthor : project.getAuthors()) {
					projectData.getAuthors().add(new org.mcupdater.project.Author(feedAuthor.getName(),feedAuthor.getUrl()));
				}
				projectData.setTimestamp(time);
				projectData.setCurseId(project.getId());
				projectData.setSlug(project.getSlug());
				Map<Long, Downloadable> downloadables = new HashMap<>();
				for (LatestFile file : project.getLatestFiles()) {
					Downloadable downloadable;
					if (downloadables.containsKey(file.getId())) {
						downloadable = downloadables.get(file.getId());
					} else {
						downloadable = new Downloadable();
					}
					downloadable.setFileID(file.getId());
					downloadable.setFilename(file.getFileName());
					downloadable.getSupportedVersions().addAll(file.getGameVersion());
					downloadables.put(file.getId(), downloadable);
				}
				projectData.setDownloadables(new ArrayList<>(downloadables.values()));
				mods.add(projectData);
			}
			JsonWriter writer = new JsonWriter(new FileWriter("/home/smbarbour/output_source.json"));
			writer.setIndent("  ");
			gson.toJson(mods.toArray(), ProjectData[].class,writer);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
