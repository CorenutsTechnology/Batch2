package com.cnts.throwthrows_20;

public class ReThrowException {
	
	public void rethrowException() {
		try {
			int divide=10/0;
			System.out.println(divide);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	public static void main(String[] args) {
		ReThrowException reThrowException = new ReThrowException();
		try {
			reThrowException.rethrowException();
			
		}catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		
	}

}
