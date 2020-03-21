package com.store.bean.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import io.micrometer.core.lang.NonNull;

public class UserRequest {

	@NonNull
	@Size(min = 4, max = 25)
	private String username;
	@NonNull
	@Size(min = 4, max = 25)
	private String password;
	@NonNull
	@Email
	private String email;
	@NonNull
	@Size(min = 10, max = 12)
	private String mobile;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
