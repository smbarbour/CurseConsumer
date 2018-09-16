package org.mcupdater.curseconsumer.curse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Project {

	@SerializedName("id")
	@Expose
	private Long id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("authors")
	@Expose
	private List<Author> authors = null;
	@SerializedName("attachments")
	@Expose
	private List<Attachment> attachments = null;
	@SerializedName("websiteUrl")
	@Expose
	private String websiteUrl;
	@SerializedName("gameId")
	@Expose
	private Long gameId;
	@SerializedName("summary")
	@Expose
	private String summary;
	@SerializedName("defaultFileId")
	@Expose
	private Long defaultFileId;
	@SerializedName("commentCount")
	@Expose
	private Long commentCount;
	@SerializedName("downloadCount")
	@Expose
	private Double downloadCount;
	@SerializedName("rating")
	@Expose
	private Long rating;
	@SerializedName("installCount")
	@Expose
	private Long installCount;
	@SerializedName("latestFiles")
	@Expose
	private List<LatestFile> latestFiles = null;
	@SerializedName("categories")
	@Expose
	private List<Category> categories = null;
	@SerializedName("primaryAuthorName")
	@Expose
	private String primaryAuthorName;
	@SerializedName("externalUrl")
	@Expose
	private Object externalUrl;
	@SerializedName("status")
	@Expose
	private Long status;
	@SerializedName("stage")
	@Expose
	private Long stage;
	@SerializedName("donationUrl")
	@Expose
	private Object donationUrl;
	@SerializedName("primaryCategoryName")
	@Expose
	private String primaryCategoryName;
	@SerializedName("primaryCategoryAvatarUrl")
	@Expose
	private String primaryCategoryAvatarUrl;
	@SerializedName("likes")
	@Expose
	private Long likes;
	@SerializedName("categorySection")
	@Expose
	private CategorySection categorySection;
	@SerializedName("packageType")
	@Expose
	private Long packageType;
	@SerializedName("avatarUrl")
	@Expose
	private Object avatarUrl;
	@SerializedName("slug")
	@Expose
	private String slug;
	@SerializedName("clientUrl")
	@Expose
	private String clientUrl;
	@SerializedName("gameVersionLatestFiles")
	@Expose
	private List<GameVersionLatestFile> gameVersionLatestFiles = null;
	@SerializedName("isFeatured")
	@Expose
	private Long isFeatured;
	@SerializedName("popularityScore")
	@Expose
	private Double popularityScore;
	@SerializedName("gamePopularityRank")
	@Expose
	private Long gamePopularityRank;
	@SerializedName("fullDescription")
	@Expose
	private String fullDescription;
	@SerializedName("gameName")
	@Expose
	private String gameName;
	@SerializedName("portalName")
	@Expose
	private String portalName;
	@SerializedName("sectionName")
	@Expose
	private String sectionName;
	@SerializedName("dateModified")
	@Expose
	private String dateModified;
	@SerializedName("dateCreated")
	@Expose
	private String dateCreated;
	@SerializedName("dateReleased")
	@Expose
	private String dateReleased;
	@SerializedName("isAvailable")
	@Expose
	private Boolean isAvailable;
	@SerializedName("categoryList")
	@Expose
	private String categoryList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getDefaultFileId() {
		return defaultFileId;
	}

	public void setDefaultFileId(Long defaultFileId) {
		this.defaultFileId = defaultFileId;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public Double getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(Double downloadCount) {
		this.downloadCount = downloadCount;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public Long getInstallCount() {
		return installCount;
	}

	public void setInstallCount(Long installCount) {
		this.installCount = installCount;
	}

	public List<LatestFile> getLatestFiles() {
		return latestFiles;
	}

	public void setLatestFiles(List<LatestFile> latestFiles) {
		this.latestFiles = latestFiles;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String getPrimaryAuthorName() {
		return primaryAuthorName;
	}

	public void setPrimaryAuthorName(String primaryAuthorName) {
		this.primaryAuthorName = primaryAuthorName;
	}

	public Object getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(Object externalUrl) {
		this.externalUrl = externalUrl;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStage() {
		return stage;
	}

	public void setStage(Long stage) {
		this.stage = stage;
	}

	public Object getDonationUrl() {
		return donationUrl;
	}

	public void setDonationUrl(Object donationUrl) {
		this.donationUrl = donationUrl;
	}

	public String getPrimaryCategoryName() {
		return primaryCategoryName;
	}

	public void setPrimaryCategoryName(String primaryCategoryName) {
		this.primaryCategoryName = primaryCategoryName;
	}

	public String getPrimaryCategoryAvatarUrl() {
		return primaryCategoryAvatarUrl;
	}

	public void setPrimaryCategoryAvatarUrl(String primaryCategoryAvatarUrl) {
		this.primaryCategoryAvatarUrl = primaryCategoryAvatarUrl;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public CategorySection getCategorySection() {
		return categorySection;
	}

	public void setCategorySection(CategorySection categorySection) {
		this.categorySection = categorySection;
	}

	public Long getPackageType() {
		return packageType;
	}

	public void setPackageType(Long packageType) {
		this.packageType = packageType;
	}

	public Object getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(Object avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getClientUrl() {
		return clientUrl;
	}

	public void setClientUrl(String clientUrl) {
		this.clientUrl = clientUrl;
	}

	public List<GameVersionLatestFile> getGameVersionLatestFiles() {
		return gameVersionLatestFiles;
	}

	public void setGameVersionLatestFiles(List<GameVersionLatestFile> gameVersionLatestFiles) {
		this.gameVersionLatestFiles = gameVersionLatestFiles;
	}

	public Long getIsFeatured() {
		return isFeatured;
	}

	public void setIsFeatured(Long isFeatured) {
		this.isFeatured = isFeatured;
	}

	public Double getPopularityScore() {
		return popularityScore;
	}

	public void setPopularityScore(Double popularityScore) {
		this.popularityScore = popularityScore;
	}

	public Long getGamePopularityRank() {
		return gamePopularityRank;
	}

	public void setGamePopularityRank(Long gamePopularityRank) {
		this.gamePopularityRank = gamePopularityRank;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getPortalName() {
		return portalName;
	}

	public void setPortalName(String portalName) {
		this.portalName = portalName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateReleased() {
		return dateReleased;
	}

	public void setDateReleased(String dateReleased) {
		this.dateReleased = dateReleased;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(String categoryList) {
		this.categoryList = categoryList;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).append("authors", authors).append("attachments", attachments).append("websiteUrl", websiteUrl).append("gameId", gameId).append("summary", summary).append("defaultFileId", defaultFileId).append("commentCount", commentCount).append("downloadCount", downloadCount).append("rating", rating).append("installCount", installCount).append("latestFiles", latestFiles).append("categories", categories).append("primaryAuthorName", primaryAuthorName).append("externalUrl", externalUrl).append("status", status).append("stage", stage).append("donationUrl", donationUrl).append("primaryCategoryName", primaryCategoryName).append("primaryCategoryAvatarUrl", primaryCategoryAvatarUrl).append("likes", likes).append("categorySection", categorySection).append("packageType", packageType).append("avatarUrl", avatarUrl).append("slug", slug).append("clientUrl", clientUrl).append("gameVersionLatestFiles", gameVersionLatestFiles).append("isFeatured", isFeatured).append("popularityScore", popularityScore).append("gamePopularityRank", gamePopularityRank).append("fullDescription", fullDescription).append("gameName", gameName).append("portalName", portalName).append("sectionName", sectionName).append("dateModified", dateModified).append("dateCreated", dateCreated).append("dateReleased", dateReleased).append("isAvailable", isAvailable).append("categoryList", categoryList).toString();
	}

}