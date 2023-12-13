package com.feuji23nov;

public class Employee 
{
	//constructor overloading
	private int empId;
	private String empName;
	private double empSal;
	private String designation;
	public Employee() 
	{
		System.out.println("default constructor of employee..");
	}
	public Employee(int empId) {
		//this();
		this.empId = empId;
	}
	public Employee(int empId, String empName) {
		
		this(empId);
		this.empName = empName;
	}
	public Employee(int empId, String empName, double empSal, String designation) {
		
		this(empId,empName);
		this.empSal = empSal;
		this.designation = designation;
	}
	public void displayDetails()
	{
		System.out.println("EmpId:"+empId);
		System.out.println("EmpName:"+empName);
		System.out.println("Empsal"+empSal);
		System.out.println("Designation:"+designation);
	}
	
	
	
	
	
	

}
