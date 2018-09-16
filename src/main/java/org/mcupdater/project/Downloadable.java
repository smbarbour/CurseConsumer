package org.mcupdater.project;

import java.util.ArrayList;
import java.util.List;

public class Downloadable {
	private String filename;
	private String md5hash;
	private long filesize;
	private List<String> supportedVersions;
	private List<String> urls;
	private List<String> dependencies;
	private long fileID;

	public Downloadable() {
		supportedVersions = new ArrayList<>();
		urls = new ArrayList<>();
		dependencies = new ArrayList<>();
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMd5hash() {
		return md5hash;
	}

	public void setMd5hash(String md5hash) {
		this.md5hash = md5hash;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}

	public List<String> getSupportedVersions() {
		return supportedVersions;
	}

	public void setSupportedVersions(List<String> supportedVersions) {
		this.supportedVersions = supportedVersions;
	}

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public List<String> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<String> dependencies) {
		this.dependencies = dependencies;
	}

	public long getFileID() {
		return fileID;
	}

	public void setFileID(long fileID) {
		this.fileID = fileID;
	}
}
