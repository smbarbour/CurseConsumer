package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Session {

	@SerializedName("UserID")
	@Expose
	private Integer userID;
	@SerializedName("Username")
	@Expose
	private String username;
	@SerializedName("DisplayName")
	@Expose
	private Object displayName;
	@SerializedName("SessionID")
	@Expose
	private String sessionID;
	@SerializedName("Token")
	@Expose
	private String token;
	@SerializedName("EmailAddress")
	@Expose
	private String emailAddress;
	@SerializedName("EffectivePremiumStatus")
	@Expose
	private Boolean effectivePremiumStatus;
	@SerializedName("ActualPremiumStatus")
	@Expose
	private Boolean actualPremiumStatus;
	@SerializedName("SubscriptionToken")
	@Expose
	private Integer subscriptionToken;
	@SerializedName("Expires")
	@Expose
	private Long expires;
	@SerializedName("RenewAfter")
	@Expose
	private Long renewAfter;
	@SerializedName("IsTemporaryAccount")
	@Expose
	private Boolean isTemporaryAccount;
	@SerializedName("IsMerged")
	@Expose
	private Boolean isMerged;
	@SerializedName("Bans")
	@Expose
	private Integer bans;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Object getDisplayName() {
		return displayName;
	}

	public void setDisplayName(Object displayName) {
		this.displayName = displayName;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Boolean getEffectivePremiumStatus() {
		return effectivePremiumStatus;
	}

	public void setEffectivePremiumStatus(Boolean effectivePremiumStatus) {
		this.effectivePremiumStatus = effectivePremiumStatus;
	}

	public Boolean getActualPremiumStatus() {
		return actualPremiumStatus;
	}

	public void setActualPremiumStatus(Boolean actualPremiumStatus) {
		this.actualPremiumStatus = actualPremiumStatus;
	}

	public Integer getSubscriptionToken() {
		return subscriptionToken;
	}

	public void setSubscriptionToken(Integer subscriptionToken) {
		this.subscriptionToken = subscriptionToken;
	}

	public Long getExpires() {
		return expires;
	}

	public void setExpires(Long expires) {
		this.expires = expires;
	}

	public Long getRenewAfter() {
		return renewAfter;
	}

	public void setRenewAfter(Long renewAfter) {
		this.renewAfter = renewAfter;
	}

	public Boolean getIsTemporaryAccount() {
		return isTemporaryAccount;
	}

	public void setIsTemporaryAccount(Boolean isTemporaryAccount) {
		this.isTemporaryAccount = isTemporaryAccount;
	}

	public Boolean getIsMerged() {
		return isMerged;
	}

	public void setIsMerged(Boolean isMerged) {
		this.isMerged = isMerged;
	}

	public Integer getBans() {
		return bans;
	}

	public void setBans(Integer bans) {
		this.bans = bans;
	}

}
