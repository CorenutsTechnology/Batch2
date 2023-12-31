package com.december6;

public class Employee2 
{
	private String name;
	private String dept;
	private String location;
	public Employee2(String name, String dept, String location) {
		super();
		this.name = name;
		this.dept = dept;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", dept=" + dept + ", location=" + location + "]";
	}
	
}
