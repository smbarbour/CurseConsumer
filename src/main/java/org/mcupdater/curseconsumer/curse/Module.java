package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Module {

	@SerializedName("folderName")
	@Expose
	private String folderName;
	@SerializedName("fimgerprint")
	@Expose
	private Long fingerprint;

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

}