package com.crnt.constructor.nov2223;

public class Vehical {
	private String type;
	private int NoOfWheels;
	private TwoWheeler twoWheeler;
	
	public Vehical(String type, int NoOfWheels) {
		
		this.type = type;
		this.NoOfWheels = NoOfWheels;
	}
	public Vehical() {
		
	}
	
	public Vehical(String type2, TwoWheeler twoWheeler) {
		this.type = type2;
		this.twoWheeler=twoWheeler;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfWheels() {
		return NoOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		NoOfWheels = noOfWheels;
	}
	public TwoWheeler getTwoWheeler()
	{
		return twoWheeler;
	}
	public void setTwoWheeler(TwoWheeler twoWheeler) {
		this.twoWheeler = twoWheeler;
	}
	@Override
	public String toString() {
		return "Vehical [type=" + type + ", NoOfWheels=" + NoOfWheels + ", twoWheeler=" + twoWheeler + "]";
	}

}
