package com.cnts.constructors;

public class Employee extends Person{
	
	int empid;
	String email="keerthi@gmail.com";
	public Employee() {
		System.out.println("Employee Class");
		
	}
	public Employee(String name,int age,int empid) {
		super( name, age);
		this.empid=empid;
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + "]";
	}
	
	void display() {
		System.out.println(super.email);
		System.out.println(email);
		
	}
	
}
