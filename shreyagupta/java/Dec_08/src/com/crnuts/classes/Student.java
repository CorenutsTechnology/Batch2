package com.crnuts.classes;

import java.util.Objects;

public class Student {

	private String firstName;

	private String lastName;

	private String motherName;

	public Student(String firstName, String lastName, String motherName) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.motherName = motherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", motherName=" + motherName + "]";
	}

}
