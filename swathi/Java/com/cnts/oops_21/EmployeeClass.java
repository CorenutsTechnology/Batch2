package com.cnts.oops_21;

public class EmployeeClass implements Employee{
	
	private String name;
	private double salary;
	
	EmployeeClass (String name,double salary){
		this.name=name;
		this.salary=salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String empname() {
		return name;
	}

	@Override
	public double Salary() {
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
