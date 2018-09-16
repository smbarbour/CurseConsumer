package org.mcupdater.curseconsumer.curse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthResponse {

	@SerializedName("Status")
	@Expose
	private Integer status;
	@SerializedName("StatusMessage")
	@Expose
	private Object statusMessage;
	@SerializedName("Session")
	@Expose
	private Session session;
	@SerializedName("Timestamp")
	@Expose
	private Long timestamp;
	@SerializedName("TwitchUsernameReservationToken")
	@Expose
	private String twitchUsernameReservationToken;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(Object statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getTwitchUsernameReservationToken() {
		return twitchUsernameReservationToken;
	}

	public void setTwitchUsernameReservationToken(String twitchUsernameReservationToken) {
		this.twitchUsernameReservationToken = twitchUsernameReservationToken;
	}

}