package com.crnuts.impleClass;

public class Address  {

	private String houseNo;
	private String streetArea;
	private String city;
	private String state;
	private int pincode;

	public Address(String houseNo, String streetArea, String city,String state, int pincode) {

		this.houseNo = houseNo;
		this.streetArea = streetArea;
		this.city = city;
		this.state=state;
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetArea() {
		return streetArea;
	}

	public void setStreetArea(String streetArea) {
		this.streetArea = streetArea;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	

	
	

}
