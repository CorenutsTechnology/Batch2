package com.exception_overriding.nov21;

public class Dog7 extends Animal6
{
	@Override
	void eat() 
	{
		System.out.println("dog is eating");
	}
	
	public static void main(String[] args)
	{
		//method overriding
		Animal6 animal = new Animal6();
		animal.eat();
		Dog7 dog = new Dog7();
		dog.eat();
	}
	
}
