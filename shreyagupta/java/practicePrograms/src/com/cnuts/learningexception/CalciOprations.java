package com.cnuts.learningexception;

public class CalciOprations implements Calculator {

	@Override
	public void add(int value1, int value2) {
		try {
			int result = 0;
			int[] array = { value1, value2, 4, 2 };
			for (int index = 0; index < array.length; index++) {
				result = array[++index] + array[index + 7];
			}

			System.out.println("Addition result" + result);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Exception occured: " +e);
		}
		
		
	}

	@Override
	public void subtract(int value1, int value2) {
		int output = value1 - value2;
		System.out.println("Subtraction output: " + output);
	}

	@Override
	public void multiply(int value1, int value2) {
		int output = value1 * value2;
		System.out.println("Multipication output: " + output);
	}

	@Override
	public void divide(int value1, int value2) {
//		try {
//			int output = value1 / value2;
//			System.out.println("addition output: " + output);
//		} catch (ArithmeticException e) {
//			// e.printStackTrace();
//			System.out.println("exception occured :" + e);
//		}

		int output = value1 / value2;
		System.out.println("Division output: " + output);

	}

}
