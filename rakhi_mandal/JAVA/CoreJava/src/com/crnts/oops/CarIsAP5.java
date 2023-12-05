//IS a relation 
package com.crnts.oops;

public class CarIsAP5 extends VehicleIsAP5 {
	static CarIsAP5 carIsAP5 =new CarIsAP5();
	String brand="Mahindra";
	public static void main(String[] args) {
		carIsAP5.display();
		System.out.println(carIsAP5.brand);
	}
	
	void display() {
		System.out.println(carIsAP5.Mode);
		System.out.println(carIsAP5.wheels);
	}

}
