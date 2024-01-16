package com.spring.main;

import java.util.List;

public class School 
{
	private String  name;
	private List<Student> student;
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", student=" + student + "]";
	}
	
		

}
