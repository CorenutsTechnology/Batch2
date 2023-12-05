
package com.crnts.List.Assignment;

import java.util.Objects;

public class Student // implements  Comparable<Student> 
{
	 private Integer studentId;
	 private String name;
	 private String course;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int studentId, String name, String course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", course=" + course + "]";
	}
//
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.studentId-o.getStudentId() ; 
//	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return Objects.hash(course, name, studentId);
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name)
				&& Objects.equals(studentId, other.studentId);
	}
	
	
	//needed in set

	 
}
