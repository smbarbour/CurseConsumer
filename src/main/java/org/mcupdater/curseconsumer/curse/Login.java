package org.mcupdater.curseconsumer.curse;

public class Login {
	private String Username;
	private String Password;

	public Login(String username, String password) {
		Username = username;
		Password = password;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}
}
