package com.crnuts.impleClass;

import com.crnuts.interfaces.Company;

public class Employee implements Company {

	private int eid;
	private String name;
	private long phno;
	private String panNo;
	private Address address;

	public Employee(int eid, String name, long phno, String panNo, String houseNo, String streetArea, String city,
			String state, int pincode) {
		this.eid = eid;
		this.name = name;
		this.phno = phno;
		this.panNo = panNo;
		this.address = new Address(houseNo, streetArea, city, state, pincode);
	}
	
	public Address addressOfEmployee(String houseNo, String streetArea, String city,
			String state, int pincode) {
		//Address address = new Address(houseNo, streetArea, city, state, pincode);
		System.out.println("Address of employee "+name+" [houseNo=" + houseNo + ", streetArea=" + streetArea + 
				", city=" + city + ", state="+ state + ", pincode=" + pincode + "]");
		return new Address(houseNo, streetArea, city, state, pincode);
	}
	
	
	

	@Override
	public void employeeDetails() {
		System.out.println("Employee [eid=" + eid + ", name=" + name + ", phno=" + phno + ", panNo=" + panNo + "]");

	}

	@Override
	public void logIn(int eid) {
		System.out.println("Enter employee ID to login: " + eid);
		System.out.println("Login date and time : "+ java.time.LocalDateTime.now());

	}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
