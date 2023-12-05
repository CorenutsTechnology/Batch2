package com.feuji.operators_09;

public class LogicalOperators {
	
	public void logicalAnd(int value1,int value2) {
		if((value1 > 10) && (value2++ <= 30)) {
			System.out.println(value2);	
		}
		else {
			System.out.println(value2);
		}
		
	}
	
	public boolean logicalOr(int value1 , int value2) {
		boolean result =(value1 < value2) || (value1 > value2);
		
		return result;
	}
	
	public boolean logicalNot(int value1 , int value2) {
		boolean result = !(value1 < value2);
		return result;
	}
	public static void main(String[] args) {
		LogicalOperators logicalOperators = new LogicalOperators();
		
		logicalOperators.logicalAnd(10, 200);
		System.out.println(logicalOperators.logicalOr(100, 15));
		System.out.println(logicalOperators.logicalOr(10,20));
	}

}
