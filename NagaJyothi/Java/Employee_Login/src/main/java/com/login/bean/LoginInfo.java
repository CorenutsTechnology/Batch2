package com.login.bean;

public class LoginInfo 
{
	private int id;
	private String email;
	private String password;
	private RegistrationBean registration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RegistrationBean getRegistration() {
		return registration;
	}
	public void setRegistration(RegistrationBean registration) {
		this.registration = registration;
	}
	public LoginInfo(int id, String email, String password, RegistrationBean registration) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.registration = registration;
	}
	public LoginInfo() {
		super();
	}
	

}
