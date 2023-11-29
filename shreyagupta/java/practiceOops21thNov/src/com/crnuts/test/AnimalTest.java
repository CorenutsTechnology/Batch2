package com.crnuts.test;

import com.crnuts.interfaces.Animal;
import com.crnuts.impleClass.Dog;

public class AnimalTest {
	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog dog=new Dog();

		System.out.println("Dog has " + animal.leg + " legs.");
		
		animal.speak();
		animal.eat();
		
		// animal.ispet(); //isPet() is not defined in Animal type
		
		dog.isPet();
	}
}
