package com.feuji.operators_09;

public class ArithmeticOperators {
	
	public int addition(int value1 ,int value2) {
		int result = (value1+value2)*(value1/value2);
		System.out.println("addition result -->"+result);
		
		return result;
			
	}
	public int subtraction(int value1 ,int value2) {
		int result = (value1-value2)+(value1+10);
		System.out.println("subtraction result -->"+result);
		
		return result;
			
	}
	public int multiplication(int value1 ,int value2) {
		int result = (value1*value2)+(value1*10);
		System.out.println("multiplication result -->"+result);
		
		return result;
			
	}
	public int division(int value1 ,int value2) {
		int result = (value1/value2);
		System.out.println("division result -->"+result);
		
		return result;
			
	}
	public int moduler(int value1 ,int value2) {
		int result = value1%value2;
		System.out.println("moduler result -->"+result);
		
		return result;
			
	}
	
	
	

}
