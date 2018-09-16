package org.mcupdater.curseconsumer.curse;

public class Register {
	private String Username;
	private String Password;
	private String Email;
	private boolean Newsletter;

	public Register(String username, String password, String email, boolean newsletter) {
		Username = username;
		Password = password;
		Email = email;
		Newsletter = newsletter;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}

	public String getEmail() {
		return Email;
	}

	public boolean isNewsletter() {
		return Newsletter;
	}
}
