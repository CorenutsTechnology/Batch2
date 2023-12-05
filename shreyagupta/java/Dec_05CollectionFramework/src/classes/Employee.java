package com.crnuts.classes;

import java.util.Comparator;
import java.util.Objects;

public class Employee  {

	private int eid;
	private String ename;
	private double sal;

	public Employee(int eid, String ename, double sal) {

		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
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
		return Objects.hash(eid, ename, sal);
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
		return eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}



	


	
}
