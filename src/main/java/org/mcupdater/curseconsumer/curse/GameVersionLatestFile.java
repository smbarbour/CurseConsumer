package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class GameVersionLatestFile {

	@SerializedName("gameVersion")
	@Expose
	private String gameVersion;
	@SerializedName("projectFileId")
	@Expose
	private Long projectFileId;
	@SerializedName("projectFileName")
	@Expose
	private String projectFileName;
	@SerializedName("fileType")
	@Expose
	private Long fileType;

	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public Long getProjectFileId() {
		return projectFileId;
	}

	public void setProjectFileId(Long projectFileId) {
		this.projectFileId = projectFileId;
	}

	public String getProjectFileName() {
		return projectFileName;
	}

	public void setProjectFileName(String projectFileName) {
		this.projectFileName = projectFileName;
	}

	public Long getFileType() {
		return fileType;
	}

	public void setFileType(Long fileType) {
		this.fileType = fileType;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("gameVersion", gameVersion).append("projectFileId", projectFileId).append("projectFileName", projectFileName).append("fileType", fileType).toString();
	}

}