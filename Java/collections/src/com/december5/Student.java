package com.december5;

public class Student 
{
	private Integer sno;
	private String name;
	private double marks;
	public Student(Integer sno, String name, double marks) {
		super();
		this.sno = sno;
		this.name = name;
		this.marks = marks;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String toString()
	{
		return "sno: "+this.sno+" name: "+this.name+" marks: "+this.marks ;
	}
}
