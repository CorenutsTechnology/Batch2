package com.asignments;

import java.util.Comparator;

public class Student  implements Comparator<Student>
{
	private int studentId;
	private String studentName;
	private int studentAge;
	private String department;
	
	public Student(int studentId, String studentName, int studentAge, String department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.department = department;
	}
	public Student()
	{
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentage) {
		this.studentAge = studentage;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", department=" + department + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStudentName().compareTo(o2.getStudentName());
	}
	
	

}
