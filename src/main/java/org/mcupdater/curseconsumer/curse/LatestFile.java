package org.mcupdater.curseconsumer.curse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LatestFile {

	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("displayName")
	@Expose
	private String displayName;
	@SerializedName("fileName")
	@Expose
	private String fileName;
	@SerializedName("fileNameOnDisk")
	@Expose
	private String fileNameOnDisk;
	@SerializedName("fileDate")
	@Expose
	private String fileDate;
	@SerializedName("fileLength")
	@Expose
	private Long fileLength;
	@SerializedName("releaseType")
	@Expose
	private Long releaseType;
	@SerializedName("fileStatus")
	@Expose
	private Long fileStatus;
	@SerializedName("downloadUrl")
	@Expose
	private String downloadUrl;
	@SerializedName("isAlternate")
	@Expose
	private Boolean isAlternate;
	@SerializedName("alternateFileId")
	@Expose
	private Long alternateFileId;
	@SerializedName("dependencies")
	@Expose
	private List<Dependency> dependencies = null;
	@SerializedName("isAvailable")
	@Expose
	private Boolean isAvailable;
	@SerializedName("modules")
	@Expose
	private List<Module> modules = null;
	@SerializedName("packageFingerprint")
	@Expose
	private Long packageFingerprint;
	@SerializedName("gameVersion")
	@Expose
	private List<String> gameVersion = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileNameOnDisk() {
		return fileNameOnDisk;
	}

	public void setFileNameOnDisk(String fileNameOnDisk) {
		this.fileNameOnDisk = fileNameOnDisk;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public Long getReleaseType() {
		return releaseType;
	}

	public void setReleaseType(Long releaseType) {
		this.releaseType = releaseType;
	}

	public Long getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(Long fileStatus) {
		this.fileStatus = fileStatus;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Boolean getIsAlternate() {
		return isAlternate;
	}

	public void setIsAlternate(Boolean isAlternate) {
		this.isAlternate = isAlternate;
	}

	public Long getAlternateFileId() {
		return alternateFileId;
	}

	public void setAlternateFileId(Long alternateFileId) {
		this.alternateFileId = alternateFileId;
	}

	public List<Dependency> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Long getPackageFingerprint() {
		return packageFingerprint;
	}

	public void setPackageFingerprint(Long packageFingerprint) {
		this.packageFingerprint = packageFingerprint;
	}

	public List<String> getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(List<String> gameVersion) {
		this.gameVersion = gameVersion;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("fileName", fileName).append("fileNameOnDisk", fileNameOnDisk).append("fileDate", fileDate).append("releaseType", releaseType).append("fileStatus", fileStatus).append("downloadUrl", downloadUrl).append("isAlternate", isAlternate).append("alternateFileId", alternateFileId).append("dependencies", dependencies).append("isAvailable", isAvailable).append("modules", modules).append("packageFingerprint", packageFingerprint).append("gameVersion", gameVersion).toString();
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Long getFileLength() {
		return fileLength;
	}

	public void setFileLength(Long fileLength) {
		this.fileLength = fileLength;
	}
}