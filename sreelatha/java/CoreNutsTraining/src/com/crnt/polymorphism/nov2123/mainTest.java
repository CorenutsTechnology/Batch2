package com.crnt.polymorphism.nov2123;

public class mainTest {
	public static void main(String[] args) {
		/*
		 * Dog dog = new Dog(); dog.bite(); dog.food();
		 */
		/*
		 * Benz benz = new Benz(); benz.engine(); benz.engine(2007);
		 * benz.engine("petrol"); benz.engine("good", 70 );
		 */
		FlowerImpl flower = new Rose();//upcasted to flower
	//flower.color();
		flower.fragrance();
		
		Rose rose =new Rose();
		rose.fragrance();
		rose.color();
		
	}

}
