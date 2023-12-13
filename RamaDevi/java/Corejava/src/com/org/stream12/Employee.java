package com.org.stream12;

public class Employee {
	int id;
	String name;
	double salary;
	
public Employee()
{
	
}
public Employee(int id ,String name) {
	this.id=id;
	this.name=name;
	
}
public Employee(double d)
{
	this.salary=salary;
}
public Employee(int id,String name,double salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
