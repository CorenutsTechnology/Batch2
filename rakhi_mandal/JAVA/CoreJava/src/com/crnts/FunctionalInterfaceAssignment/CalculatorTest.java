//Write a program (Take Class as Calculator) having non-static methods and then call the methods in another class with instance reference?
package com.crnts.FunctionalInterfaceAssignment;

import java.util.function.BiFunction;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator =new Calculator();
		BiFunction<Integer,Integer,Integer> add=calculator::sum;
		System.out.println(add.apply(34, 7));

	}

}
