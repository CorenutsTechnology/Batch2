package com.org.constructor23;

public class Student {
	String name;
public Student()
{
	
	this.name="Unknown";
	System.out.println(name);
}
public Student(String name)
{
	this.name=name;
	System.out.println("name is:"+name);
}

	public static void main(String[] args) {
	Student student=new Student();
	//Student student1=new Student("Ram");
	}

}
