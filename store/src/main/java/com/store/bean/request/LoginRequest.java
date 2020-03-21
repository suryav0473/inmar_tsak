package com.store.bean.request;

import java.io.Serializable;

import javax.validation.constraints.Size;

import io.micrometer.core.lang.NonNull;

public class LoginRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	@NonNull
	@Size(min = 4, max = 25)
	private String username;
	@NonNull
	@Size(min = 4, max = 25)
	private String password;

	public LoginRequest() {
		// no ops
	}

	public LoginRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
