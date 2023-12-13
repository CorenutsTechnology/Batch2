package com.org.stream13;

public class Student

{
	int id;
	String name;
	String gender;
	String dept;
	String city;
	String state;

	public Student(int id, String name,String gender) {
		this.id = id;
		this.name = name;
		this.gender=gender;
	}
	public Student(int id, String name,String gender,String dept) {
		this.id = id;
		this.name = name;
		this.gender=gender;
		this.dept=dept;
	}
	public Student(int id, String name,String gender,String dept,String city,String state) {
		this.id = id;
		this.name = name;
		this.gender=gender;
		this.dept=dept;
		this.city=city;
		this.state=state;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + "]";
	}

	public String getGender() {
		return gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
