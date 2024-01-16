package com.entity;

public class Employee 
{
	private int empId;
	private String ename;
	private String edept;
	private double esal;
	public Employee()
	{
		
	}
	public Employee(int empId, String ename, String edept, double esal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.edept = edept;
		this.esal = esal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", edept=" + edept + ", esal=" + esal + "]";
	}
	

}
