//Write a program (Take Class as Car) having static methods and then call the methods in another class with static method reference? 
package com.crnts.FunctionalInterfaceAssignment;

import java.util.function.Supplier;

public class CarTest {

	public static void main(String[] args) {
		
		Supplier<String> word=Car::getName;
		  ;System.out.println(word.get());
}
		
	}



