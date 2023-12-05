package com.cnts.oops_21;

public class Cat extends Animal{

	public Cat(String species, String sound) {
		super(species, sound);
	}
	
	public void noise() {
		System.out.println("The " + getSpecies() + " makes a " + getSound() + " sound.");
	}
	
	

}
