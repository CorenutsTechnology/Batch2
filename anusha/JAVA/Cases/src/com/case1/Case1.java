package com.case1;


class Animal{
	public void eat()throws ArithmeticException{
		System.out.println("eating....");
		throw new ArithmeticException();
		
	}
}
public class Case1 extends Animal
{
	@Override
	public void eat() throws RuntimeException {
		super.eat();
		System.out.println("animaleating....");
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		Animal animal = new Case1();
		animal.eat();
	} 
	
}
