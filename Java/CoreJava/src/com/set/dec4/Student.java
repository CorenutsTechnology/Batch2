package com.set.dec4;

import java.util.Objects;

public class Student implements Comparable<Student>
{
	private Integer sno;
	private String name;
	private Double marks;
	public Student(Integer sno, String name, Double marks) {
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
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	public String toString()
	{
		return "sno: "+this.sno+" name: "+this.name+" marks: "+this.marks ;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(sno, name, marks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return other.sno.equals(this.sno) &&
				other.name.equals(this.name)&&
				other.marks.equals(this.marks);
	}
	@Override
	public int compareTo(Student o) 
	{
		return this.name.compareTo(o.name);
		
	}
		
}
