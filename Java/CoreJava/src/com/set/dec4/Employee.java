package com.set.dec4;

public class Employee implements Comparable<Employee>
{
	private Integer empNo;
	private String name;
	private Double salary;
	
	
	public Employee(Integer empNo, String name, Double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee6 [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.salary.compareTo(o.salary);
	}
	
}
