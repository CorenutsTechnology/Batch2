package com.cnts.constructors;

public class StudentRegistrationForm {
	
	String name;
	static String collegeName;
	long phoneNumber;
	public StudentRegistrationForm(String name, long phoneNumber,String collegeName) {
		this.collegeName=collegeName;
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	@Override
	public String toString() {
		return "StudentRegistrationForm [name=" + name + ", phoneNumber=" + phoneNumber + ", collegeName=" + collegeName + "]";
	}
public StudentRegistrationForm(String name, long phoneNumber) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	collegeName="Bangalore city college";
}
	
	
	
	
	
	

}
