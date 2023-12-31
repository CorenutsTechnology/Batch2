package com.student.dto;

public class Student 
{
	private int id;
	private String name;
	private long phno;
	private String password;
	private int marks;
	private String location;
	public Student() {
		super();
	}
	public Student(int id, String name, long phno, String password, int marks, String location) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.password = password;
		this.marks = marks;
		this.location = location;
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
	public long getphno() {
		return phno;
	}
	public void setphno(long phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phno=" + phno + ", password=" + password + ", marks="
				+ marks + ", location=" + location + "]";
	}
	
	
	
	
}
