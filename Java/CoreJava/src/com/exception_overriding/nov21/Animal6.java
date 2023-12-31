package com.exception_overriding.nov21;

public class Animal6 
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
	void eat(Dog7 dog)
	{
		dog.eat();
	}
	public static void main(String[] args) 
	{
		//overloading
		Animal6 animal = new Animal6();
		animal.eat();
		animal.eat(new Dog7());
	}
}
