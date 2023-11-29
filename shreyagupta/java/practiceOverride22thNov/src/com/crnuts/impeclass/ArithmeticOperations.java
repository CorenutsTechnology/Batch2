package com.crnuts.impeclass;

public class ArithmeticOperations {
	
	public void divide(int value1, int value2) {
		try {
			int output = value1 / value2;
			System.out.println("addition output: " + output);
		} catch (ArithmeticException e) {
			
			System.out.println("exception occured :" + e);
		}

		

	}

}
