package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Registration {
	private String email;
	@Id
	private String username;
	private String password;
	
	public Registration()
	{
		
	}
	
	public Registration(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Registration [email=" + email + ", username=" + username + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

}
