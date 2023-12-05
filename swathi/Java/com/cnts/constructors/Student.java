package com.cnts.constructors;

public class Student {
	
	String name1;
	int rollno;
	String name2;
	
	public Student() {
		this.name1="Unknown";
	}
	public Student(String name1, String name2,int rollno) {
		this.name1 = name1;
		this.rollno = rollno;
		this.name2=name2;
	}
	
	public void displayMessage() {
		System.out.println("Student name is "+ name1 +" "+ name2+ "Roll number is "+rollno);
	}
	
	

	

}
