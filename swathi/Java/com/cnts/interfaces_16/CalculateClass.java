package com.cnts.interfaces_16;

public class CalculateClass implements Calculator{
	
	@Override
	public void calculate(int value1, int value2) {
		int result = value1+value2;
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		// doubleValue =20.0;//As Variables in interface are static final we cannot
		// reinitialize we will get the compilation error "The final field
		// Calculator.doubleValue cannot be assigned"
		
		CalculateClass calculateClass =new CalculateClass();
		calculateClass.calculate(10, 20);
		System.out.println(doubleValue);
		
		
		
		
	}
	
	

}
