//Create a program to add Student elements to array list object and display the elements using for loop
//and Iterator interface. 

package com.crnts.List;


public class Student implements Comparable<Student>
{
	 private int studentId;
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
//	@Override
//	public int hashCode() {
//		return Objects.hash(course, name, studentId);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(course, other.course) && Objects.equals(name, other.name) && studentId == other.studentId;
//	}
	
	
	//needed in set
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName() );  
//		return o1.getUserId()-o2.getUserId();
		

	}
	 
}
