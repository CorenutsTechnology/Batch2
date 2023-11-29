package com.crnt.constructor.nov2223;

public class TwoWheeler extends Vehical{
	private String type;
	
	private Vehical vehical;

	private int NoOfWheels;

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(String type, int NoOfWheels) {
		
	this.type=type;
	this.NoOfWheels=NoOfWheels;
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(String type, int NoOfWheels, String type2, Vehical vehical, int noOfWheels2) {
		this.type = type2;
		this.vehical = vehical;
	this.NoOfWheels = noOfWheels2;
	}

	public int getNoOfWheels() {
		return NoOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		NoOfWheels = noOfWheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	@Override
	public String toString() {
		return "TwoWheeler [type=" + type + ", vehical=" + vehical + "]";
	}
	
	
	
	
	

	
}
