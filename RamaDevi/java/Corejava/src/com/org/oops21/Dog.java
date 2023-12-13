package com.org.oops21;

public class Dog implements Animal{

	@Override
	public void live() {
		System.out.println("In street");
		
	}
	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.live();
		
		Dog dog=new Dog();
		dog.live();
	}

}
