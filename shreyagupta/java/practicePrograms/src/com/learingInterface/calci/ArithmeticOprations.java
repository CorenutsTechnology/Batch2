package com.learingInterface.calci;

public class ArithmeticOprations implements Calculator {
	
	

	@Override
	public void addition() {
		System.out.println("Addition in calci");
		
		//Calculator.value=30; WE CAN NOT CHANGE VALUE OF INTERFACE VARIABLE in implementation class,
		//because variables in interface is always static and final.
		
	}

	@Override
	public void subtraction() {
		System.out.println("Subtraction in calci");

		
	}

	@Override
	public void multipication() {
		System.out.println("Multipication in calci");

	}

	@Override
	public void division() {
		System.out.println("Division in calci");

		
	}
	
	

}
