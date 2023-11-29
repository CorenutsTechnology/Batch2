package com.cnts.nov23;

class Student {
	String name;
	
	public Student(){
		System.out.println("Unknown");
	}

	public Student(String name) {
		this.name=name;
		System.out.println("Name: "+name);
	}
}

public class Main1
{
	public static void main(String[] args) {
		
		Student student = new Student();
		Student student2 = new Student("Anisha");
		Student student3 = new Student("Varsha");
		
	}
}
