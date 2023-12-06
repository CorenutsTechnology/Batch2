package com.crnts.map;

import java.util.Objects;

public class Employee {
	private Integer employeeId;
	 private Double salary;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public Employee(Integer employeeId, Double salary) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, salary);
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
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	 
}
