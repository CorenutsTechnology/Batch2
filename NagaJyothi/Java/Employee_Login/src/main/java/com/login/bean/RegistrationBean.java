package com.login.bean;

public class RegistrationBean {
	private int id;
	private String fristName;
	private String lastName;
	private int age;
	private String gender;
	private String email;
	private String password;
	private String phoneNumber;
	private String state;
	private String country;
	private int pinCode;

	public RegistrationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationBean(int id, String fristName, String lastName, int age, String gender, String email,
			String password, String phoneNumber, String state, String country, int pinCode) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "RegistrationBean [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}

}
