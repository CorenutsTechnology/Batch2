package com.crnt.polymorphism.nov2123;

public class Car extends Vehical {

	@Override
	public Benz engine() {
		System.out.println("it is a car engine");
		return new Benz();
		
	}

	@Override
	public Object engine(String type) {
		System.out.println("the type of the car engine is "+type);
		return new Object();
	}

	@Override
	public Vehical engine(int model) {
		System.out.println("the model of the car engine is "+model);
		return new Vehical();
	}

	@Override
	public void engine(String performance, int speed) {
		System.out.println("the performance of car is "+performance+" & speed : "+speed);
		
	}
	

}
