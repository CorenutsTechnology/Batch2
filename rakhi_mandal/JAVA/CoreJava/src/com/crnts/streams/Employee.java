
package com.crnts.streams;

public class Employee {
  private String name;
  private String designation;
  private Double salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Employee(String name, String designation, Double salary) {
	super();
	this.name = name;
	this.designation = designation;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}

}
