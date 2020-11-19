package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CategorySection {

	@SerializedName("Id")
	@Expose
	private Long id;
	@SerializedName("gameId")
	@Expose
	private Long gameId;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("packageType")
	@Expose
	private Long packageType;
	@SerializedName("path")
	@Expose
	private String path;
	@SerializedName("initialInclusionPattern")
	@Expose
	private String initialInclusionPattern;
	@SerializedName("extraIncludePattern")
	@Expose
	private Object extraIncludePattern;
	@SerializedName("gameCategoryId")
	@Expose
	private Long gameCategoryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPackageType() {
		return packageType;
	}

	public void setPackageType(Long packageType) {
		this.packageType = packageType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getInitialInclusionPattern() {
		return initialInclusionPattern;
	}

	public void setInitialInclusionPattern(String initialInclusionPattern) {
		this.initialInclusionPattern = initialInclusionPattern;
	}

	public Object getExtraIncludePattern() {
		return extraIncludePattern;
	}

	public void setExtraIncludePattern(Object extraIncludePattern) {
		this.extraIncludePattern = extraIncludePattern;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("gameId", gameId).append("name", name).append("packageType", packageType).append("path", path).append("initialInclusionPattern", initialInclusionPattern).append("extraIncludePattern", extraIncludePattern).toString();
	}

	public Long getGameCategoryId() {
		return gameCategoryId;
	}

	public void setGameCategoryId(Long gameCategoryId) {
		this.gameCategoryId = gameCategoryId;
	}
}