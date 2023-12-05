package com.cnts.oops_21;

public class Animal {
	private String species;
	private String sound;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public Animal(String species, String sound) {
		this.species = species;
		this.sound = sound;
	}

	public void noise() {
		System.out.println("The " + species + " makes a " + sound + " sound.");
	}

}
