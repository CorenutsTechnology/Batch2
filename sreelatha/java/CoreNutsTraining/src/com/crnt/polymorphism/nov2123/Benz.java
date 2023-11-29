package com.crnt.polymorphism.nov2123;

public class Benz extends Car {

	@Override
	public Benz engine() {
		System.out.println("it is a benz engine");
		return new Benz();
	}

	
	  @Override public Car engine(String type) {
	  System.out.println("the type of benz engine : "+type);
	  return new Car(); }
	  
	 

}
