package com.cnuts.operator;

public class LogicalOperators {
	
	// &&, ||
	
	public boolean andOperator(int value1, int value2) {
		boolean result= (value1>value2) && (value1>(10*1));
		System.out.println("logical and(&&) operator result: "+result);
		return result;
		
		}
	
	public boolean orOperator(int value1, int value2) {
		boolean result= (value1>(value2-7)) || ((value1+1)>10);
		System.out.println("logical or(||) operator result: "+result);
		return result;
		
		}
	
	

}
