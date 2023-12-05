package com.cnts.oops_21;

public class Snake extends Animal{

	public Snake(String species, String sound) {
		super(species, sound);
		
	}
	public void noise() {
		System.out.println("The " + getSpecies() + " makes a " + getSound() + " sound.");
	}

}
