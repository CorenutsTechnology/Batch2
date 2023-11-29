package com.crnt.polymorphism.nov2123;

public class EncapsulationClass {
	private String name ;
	private int age;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String country;
	@Override
	public String toString() {
		return "EncapsulationClass [name=" + name + ", age=" + age + ","
				+ " country=" + country + "]";
	}
	
	
	

}
