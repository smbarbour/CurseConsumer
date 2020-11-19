package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Module {

	@SerializedName("folderName")
	@Expose
	private String folderName;
	@SerializedName("fingerprint")
	@Expose
	private Long fingerprint;
	@SerializedName("type")
	@Expose
	private Long type;


	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public Long getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(Long fingerprint) {
		this.fingerprint = fingerprint;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("folderName", folderName).append("fingerprint", fingerprint).toString();
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}
}