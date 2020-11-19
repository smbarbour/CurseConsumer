package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Attachment {

	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("projectID")
	@Expose
	private Long projectID;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("isDefault")
	@Expose
	private Boolean isDefault;
	@SerializedName("thumbnailUrl")
	@Expose
	private String thumbnailUrl;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("status")
	@Expose
	private Integer status;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProjectID() {
		return projectID;
	}

	public void setProjectID(Long projectID) {
		this.projectID = projectID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("projectID", projectID).append("description", description).append("isDefault", isDefault).append("thumbnailUrl", thumbnailUrl).append("title", title).append("url", url).toString();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}