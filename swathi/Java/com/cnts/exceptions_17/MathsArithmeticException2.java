package com.cnts.exceptions_17;

public class MathsArithmeticException2 implements MathsDivision2 {
	
	@Override
	public void division(int value1, int value2) {
		try {
			int result=value1/value2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception "+e.getMessage());
		}
		
		System.out.println("bye");
		
	}
	public static void main(String[] args) {
		MathsArithmeticException2 mathsArithmeticException = new MathsArithmeticException2();
		mathsArithmeticException.division(25, 0);
		
		
	}

}
