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
			/*
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
			HttpPost post = new HttpPost("https://logins-v1.curseapp.net/login");
			StringEntity stringEntity = new StringEntity(gson.toJson(login));
			post.setEntity(stringEntity);
			post.setHeader("Content-Type", "application/json");
			HttpResponse response = client.execute(post);
			AuthResponse auth = gson.fromJson(new InputStreamReader(response.getEntity().getContent(),"UTF8"), AuthResponse.class);
			 */
			CloseableHttpClient client = HttpClientBuilder.create().build();
			List<Project> projects = new ArrayList<>();
			int i = 0;
			Random delayRandom = new Random();
			while(true) {
				HttpGet get = new HttpGet("https://addons-ecs.forgesvc.net/api/v2/addon/search?gameId=432&sort=Name&sectionId=6&gameVersion=1.16.2&index=" + i * 1000 + "&pageSize=1000");
				HttpResponse getResponse = client.execute(get);
				System.out.println(i + ": " + getResponse.getStatusLine().getStatusCode() + " - " + getResponse.getStatusLine().getReasonPhrase());
				Project[] page = gson.fromJson(new InputStreamReader(getResponse.getEntity().getContent(), "UTF-8"), Project[].class);
				if (page != null) {
					for (int index = 0; index < page.length; index++) {
						projects.add(page[index]);
					}
					System.out.println("Records returned: " + page.length);
					if (page.length < 1000) {
						break;
					} else {
						i++;
						client.close();
						client = HttpClientBuilder.create().build();
					}
				} else {
					break;
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
				if (project.getCategories().stream().anyMatch(c -> c.getName().equals("Fabric"))) {
					projectData.setModloader("Fabric");
				}
				Map<Long, Downloadable> downloadables = new HashMap<>();
				for (GameVersionLatestFile file : project.getGameVersionLatestFiles()) {
					Downloadable downloadable;
					if (downloadables.containsKey(file.getProjectFileId())) {
						downloadable = downloadables.get(file.getProjectFileId());
					} else {
						downloadable = new Downloadable();
					}
					downloadable.setFileID(file.getProjectFileId());
					downloadable.setFilename(file.getProjectFileName());
					downloadable.getSupportedVersions().add(file.getGameVersion());
					long highPart = downloadable.getFileID() / 1000;
					long lowPart = downloadable.getFileID() % 1000;
					downloadable.getUrls().add("https://edge.forgecdn.net/files/" + highPart + "/" + lowPart + "/" + file.getProjectFileName());
					downloadables.put(file.getProjectFileId(), downloadable);
				}
				projectData.setDownloadables(new ArrayList<>(downloadables.values()));
				mods.add(projectData);
			}
			JsonWriter writer = new JsonWriter(new FileWriter("/home/smbarbour/1.16.2.json"));
			writer.setIndent("  ");
			gson.toJson(mods.toArray(), ProjectData[].class,writer);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
