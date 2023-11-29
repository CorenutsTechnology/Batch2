package com.cnts.nov17;

public class TryCatchFinally_3 {
	public static void main(String[] args) {

		// try block
		try {
			int value1 = 287;
			int value2 = 4;
			double result = value1 / value2;
			System.out.println("Result: " + result);
		}

		// catch block
		catch (ArithmeticException e) {
			System.out.println("Catch block is executed...");
			return  ;
		}

		// finally block
//		finally {
//			System.out.println("Finally block will execute everytime");
//		}
/*
 * we cant write finally block befor try and catch block
 */
		System.out.println("After try-catch-finally block");

	}
}
