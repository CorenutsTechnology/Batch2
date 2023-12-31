package com.december6;

import java.util.Objects;

public class Employee implements Comparable<Employee>
{
	private Integer empNo;
	private String name;
	private Double salary;
	private String gender;
	
	public Employee(Integer empNo, String name, Double salary,String gender)
	{
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
		this.gender=gender;
	}
	
	public void setEmpNo(Integer empNo)
	{
		this.empNo=empNo;
	}
	public Integer getEmpNo()
	{
		return this.empNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSalary(Double salary)
	{
		this.salary=salary;
	}
	public Double getSalary()
	{
		return this.salary;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString()
	{
		return "empNo: "+empNo+" Name: "+name+" Salary: "+salary+" gender: "+gender;
	}
	
	public int hashCode()
	{
		return Objects.hash(empNo,name,salary,gender);
	}
	public boolean equals(Object obj)
	{
		if(obj == this)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		return this.empNo.equals(emp.empNo) && 
				this.name.equals(emp.name) && 
				this.salary.equals(emp.salary) && 
				this.gender.equals(emp.gender);
				
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
