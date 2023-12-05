package com.cnts.oops_21;

public class Dog extends Animal{
	public String breed;
	
	public Dog(String species, String sound, String breed) {
        super(species, sound);
        this.breed = breed;
    }


	
	
	public Animal bark() {
        System.out.println("The " + breed + " dog barks loudly.");
        
        return new Animal(getSpecies(), getSound());
    }




	public String getBreed() {
		return breed;
	}




	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

}
