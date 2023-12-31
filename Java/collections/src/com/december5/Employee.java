package com.december5;

import java.util.Objects;

public class Employee {
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
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empNo, name, salary);
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
		return Objects.equals(empNo, other.empNo) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	
	
	
}
