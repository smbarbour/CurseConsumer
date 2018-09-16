package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Dependency {

	@SerializedName("addonId")
	@Expose
	private Long addonId;
	@SerializedName("type")
	@Expose
	private Long type;

	public Long getAddonId() {
		return addonId;
	}

	public void setAddonId(Long addonId) {
		this.addonId = addonId;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("addonId", addonId).append("type", type).toString();
	}

}