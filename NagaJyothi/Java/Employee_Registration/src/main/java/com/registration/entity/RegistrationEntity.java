package com.registration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_registration")
public class RegistrationEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="frist_name")
	private String fristName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pin_code")
	private int pinCode;
	
	
	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistrationEntity(int id, String fristName, String lastName, int age, String gender, String email,
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
		return "RegistrationEntity [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
	
	

}
