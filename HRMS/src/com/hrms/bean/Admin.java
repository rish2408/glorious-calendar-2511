package com.hrms.bean;

public class Admin {

	private String name;
	private String password;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	Admin() {

	}

	public Admin(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name is : " + name + "Password is : " + password + "Email is : " + email;

	};
}
