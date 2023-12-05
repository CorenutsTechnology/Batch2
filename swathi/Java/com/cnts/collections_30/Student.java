package com.cnts.collections_30;

public class Student {
	String studentName;
	int StudentId;
	
	
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		StudentId = studentId;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", StudentId=" + StudentId + "]";
	}
	
	
	

}
