package com.cnuts.learningexception;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new CalciOprations();

		calculator.add(4, 7);

		try {
			calculator.multiply(6, 9);
			calculator.divide(43, 0);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured: " +e);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured: " +e);
		}
		
		

	}

}
