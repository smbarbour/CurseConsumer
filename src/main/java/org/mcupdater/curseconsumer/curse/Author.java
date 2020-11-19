package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Author {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("projectId")
	@Expose
	private Long projectId;
	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("projectTitleId")
	@Expose
	private Long projectTitleId;
	@SerializedName("projectTitleTitle")
	@Expose
	private String projectTitleTitle;
	@SerializedName("userId")
	@Expose
	private Long userId;
	@SerializedName("twitchId")
	@Expose
	private Long twitchId;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("url", url).toString();
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectTitleTitle() {
		return projectTitleTitle;
	}

	public void setProjectTitleTitle(String projectTitleTitle) {
		this.projectTitleTitle = projectTitleTitle;
	}

	public Long getProjectTitleId() {
		return projectTitleId;
	}

	public void setProjectTitleId(Long projectTitleId) {
		this.projectTitleId = projectTitleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTwitchId() {
		return twitchId;
	}

	public void setTwitchId(Long twitchId) {
		this.twitchId = twitchId;
	}
}