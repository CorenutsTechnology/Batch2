package com.cnts.oops_21;

public class MainClass {
	
	public static void main(String[] args) {
		Dog dog=new Dog("Dog", "Woof", "Golden Retriever");	
		dog.bark();
		dog.noise();
//		Animal animal=dog.bark();
//		animal.noise();
	    Cat cat=new Cat("Cat", "Woof");	
		Snake snake=new Snake("Snake", "Woof");	
		
		AnimalSimulator animalSimulator = new AnimalSimulator();
		animalSimulator.noise(snake);
		animalSimulator.noise(cat);
		
		
		
	   
	    
		
		
		
		

	}

}
