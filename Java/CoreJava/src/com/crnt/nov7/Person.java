package com.crnt.nov7;

public class Person 
{
	private String name;
	private int age;
	private long PhoneNumber;
	private String gender;
	
	
	public Person(String name, int age, long phoneNumber, String gender) 
	{
		this.name = name;
		this.age = age;
		this.PhoneNumber = phoneNumber;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", PhoneNumber=" + 
				PhoneNumber + ", gender=" + gender + "]";
	}

	
}
