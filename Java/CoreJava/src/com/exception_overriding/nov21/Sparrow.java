package com.exception_overriding.nov21;

public class Sparrow extends Bird
{
	void sound()
	{
		System.out.println("kuch...kuch...");
	}
	public static void main(String[] args) 
	{
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
//		bird.sound();
		
		Sparrow sparrow = new Sparrow();
		sparrow.eat();
		sparrow.fly();
		sparrow.sound();
		
		AnimalKingdom8 animal = new Bird();
		animal.eat();
//		animal.fly();
		
		AnimalKingdom8 animal2 = new Sparrow();
		animal2.eat();
//		animal2.fly();
//		animal2.sound();
	}

}
