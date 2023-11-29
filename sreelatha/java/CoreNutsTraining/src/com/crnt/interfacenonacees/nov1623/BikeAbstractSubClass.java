package com.crnt.interfacenonacees.nov1623;

public class BikeAbstractSubClass extends BikeAbstractClass{
	public static void main(String[] args) {
		BikeAbstractSubClass bike = new BikeAbstractSubClass();
		bike.engine();
		bike.model();
	}

	@Override
	public void engine() {
		System.out.println("bike starts with having an engine");
		
	}

}
