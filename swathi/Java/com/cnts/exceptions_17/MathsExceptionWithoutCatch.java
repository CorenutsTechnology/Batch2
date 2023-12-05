package com.cnts.exceptions_17;

public class MathsExceptionWithoutCatch implements MathsException {

	@Override
	public void division(int value1, int value2) {
		try {
			int result=value1/value2;
			System.out.println(result);
		}finally {
			System.out.println("hello");
		}
	}
	
	public static void main(String[] args) {
		MathsExceptionWithoutCatch mathsExceptionWithoutCatch = new MathsExceptionWithoutCatch();
		mathsExceptionWithoutCatch.division(10, 0);
		
		
	}

	

	

}
