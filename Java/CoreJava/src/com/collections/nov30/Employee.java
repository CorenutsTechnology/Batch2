package com.collections.nov30;

public class Employee implements Comparable<Employee>
{
	private Integer empNo;
	private	Double salary;
	private String desgn;
	
	public Employee(int empNo, double salary, String desgn) {
		super();
		this.empNo = empNo;
		this.salary = salary;
		this.desgn = desgn;
	}

	public Integer getEmpNo(){
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", salary=" + salary + ", desgn=" + desgn + "]";
	}

	@Override
	public int compareTo(Employee object) 
	{
		return this.salary.compareTo(object.salary);
	}
	
}
