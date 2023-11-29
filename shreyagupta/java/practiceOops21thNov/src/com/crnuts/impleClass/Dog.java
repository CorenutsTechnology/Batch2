package com.crnuts.impleClass;

import com.crnuts.interfaces.Animal;



public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Dog is a animal, it barks.");

	}

	@Override
	public void eat() {
		System.out.println("Dog is a animal,it eats pedigree.");

	}
	
	public void isPet() {
		System.out.println("Dog is a pet animal.");
	}

}
