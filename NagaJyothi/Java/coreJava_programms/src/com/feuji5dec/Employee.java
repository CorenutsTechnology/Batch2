package com.feuji5dec;

public class Employee  implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private double sal;
	private String designation;
	public Employee(int empId, String empName, double sal, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", designation=" + designation
				+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getEmpName().compareTo(o.getEmpName());
	}
	
	

}
