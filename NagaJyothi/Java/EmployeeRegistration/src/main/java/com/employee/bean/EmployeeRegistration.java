package com.employee.bean;


public class EmployeeRegistration 
{
	private int id;
	private String fristName;
	private String lastName;
	private int age;
	private String gender;
	private String mail;
	private String password;
	private String phoneNumber;
	private String country;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public EmployeeRegistration(int id, String fristName, String lastName, int age, String gender, String mail,
			String password, String phoneNumber, String country, String state) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mail = mail;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.state = state;
	}
	public EmployeeRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
