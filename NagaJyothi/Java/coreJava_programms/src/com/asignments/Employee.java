package com.asignments;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator<Employee>
{
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSal) == Double.doubleToLongBits(other.empSal);
	}

	private int empId;
	private String empName;
	private double empSal;
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee()
	{
		
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empName.compareTo(o2.empName);
	}
	
	
	

}
