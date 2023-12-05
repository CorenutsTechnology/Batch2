package com.cnts.collections_30;

import java.util.Objects;

public class Employee {
	@Override
	public int hashCode() {
		System.out.println("hashcode method");
		return Objects.hash(empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println();
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	String empName;
	int empId;
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	
	
	
	

}
