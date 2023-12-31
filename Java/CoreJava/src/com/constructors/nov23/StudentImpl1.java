package com.constructors.nov23;

public class StudentImpl1
{

	public static void main(String[] args) 
	{
		Student1 student1 = new Student1("Ram");
		System.out.println(student1.name);
		Student1 student2 = new Student1("Seetha");
		Student1 student3 = new Student1();
		System.out.println(student3.name);
		Student1 student4 = new Student1("John");
		Student1 student5 = new Student1("Rose");
	}

}
