package com.crnuts.impleClass;

import org.junit.platform.commons.function.Try;

public class ArithmeticOperation {
	

	public void operations(int num1, int num2, String s) {

		try {
			System.out.println("*** Outer try block ***");
			double result = 0;
			try {
				System.out.println("--- Inner try block ---");
				result = num1 / num2;
			} catch (ArithmeticException e) {
				System.out.println("Exception in inner catch block");
				System.out.println("can't divide num" + e.getMessage());
			}
			System.out.println("division result: " + result);
			int lengthOfString = s.length();
		} catch (NullPointerException e) {
			System.out.println("Exception in outer catch block");
			System.out.println(e.getMessage());
			System.out.println("--------------------------------");
			try {
				System.out.println("try-catch block inside catch block");
				int[] array = { 5, 7, 2 };
				System.out.println(array[4]);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}

}
