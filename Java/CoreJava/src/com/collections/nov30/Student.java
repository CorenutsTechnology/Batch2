package com.collections.nov30;

public class Student 
{
	private int sno;
	private String name;
	public Student(int sno ,String name)
	{
		this.sno = sno;
		this.name=name;
	}
	@Override
	public String toString() 
	{
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
}
