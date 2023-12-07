package com.crnuts.classes;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator<Employee> {

	private int eid;
	private String ename;
	private double sal;
	private String location;
	
	public Employee(int eid, String ename, double sal) {

		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public Employee(int eid, String ename, double sal, String location) {

		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ename);
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
		return Objects.equals(ename, other.ename) || Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", location=" + location + "]";
	}

	

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return o1.ename.compareTo(o2.ename);
//	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.location.compareTo(o2.location);
	}
	
	

}
