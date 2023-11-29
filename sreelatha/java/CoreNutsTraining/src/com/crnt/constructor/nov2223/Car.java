package com.crnt.constructor.nov2223;

public class Car extends Vehical{
	private Vehical vehical;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String type, int noOfWheels) {
		super(type, noOfWheels);
		// TODO Auto-generated constructor stub
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}
	

}
