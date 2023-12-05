package com.crnts.constructors.assigmentD23;

public class Phone   {
	int id=99999 ;
	String brand="mi";
	public Phone(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	public Phone() {
		super();
		System.out.println("Came to super constructor");
		
	}

	
}
