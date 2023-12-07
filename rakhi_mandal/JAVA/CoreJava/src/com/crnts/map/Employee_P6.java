package com.crnts.map;

import java.util.Objects;

public class Employee_P6 implements Comparable<Employee_P6>
{

	private int employeeId;
	 private String name;
	 private String desination;
	 private String location;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Employee_P6(int employeeId, String name, String desination, String location) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.desination = desination;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee_P6 [employeeId=" + employeeId + ", name=" + name + ", desination=" + desination + ", location="
				+ location + "]";
	}
	
//	-----------------------------------------------------
//	@Override
//	public int hashCode() {
//		return Objects.hash(location);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee_P6 other = (Employee_P6) obj;
//		return Objects.equals(location, other.location);
//	}
	@Override
	public int compareTo(Employee_P6 o) {

		return this.location.compareTo(o.getLocation() );  
	}
	@Override
	public int hashCode() {
		return Objects.hash(desination, employeeId, location, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_P6 other = (Employee_P6) obj;
		return Objects.equals(desination, other.desination) && employeeId == other.employeeId
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}
	
//	-----------------------------------------------------
//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee_P6 other = (Employee_P6) obj;
//		return Objects.equals(name, other.name);
//	}
//	-----------------------------------------------------
	
	
	
	
	
	
	
	
	 
	 
}
