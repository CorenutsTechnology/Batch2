package com.feuji23nov;

public class Student
{
	String name;
	int id;
	int age;
	public Student()
	{
		this.name="unknown";
		System.out.println(name);
	}
	public Student(String name) {
		
		this.name = name;
	}
	public Student(String name, int id, int age) {
		
		this(name);
		this.id = id;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student("Jyothi");
		System.out.println("Name:"+s2.name);
		
	}
	

}
