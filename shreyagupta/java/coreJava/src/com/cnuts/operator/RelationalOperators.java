package com.cnuts.operator;

public class RelationalOperators {
	
	//6~ ==, !=, >, <, >=, <=
	
	public boolean equalTo(int value1, int value2) {
		System.out.println("equals to operator: " + (value1==value2));
		return value1==value2;
	}
	
	public boolean notEqualTo(int value1, int value2) {
		System.out.println("Not equals to operator: " + (value1!=value2));
		return value1!=value2;
	}
	
	public boolean greaterThan(char value1, char value2) {
		boolean result= value1>value2;
		System.out.println("greater-than operator: " + result);
		return result;
	}
	
	public boolean lessThan(int value1, int value2) {
		System.out.println("less-than operator: " + (value1<value2));
		return value1<value2;
	}
	
	public boolean greaterThanEqualsTo(int value1, int value2) {
		boolean result= value1>=value2;
		System.out.println("greater-than equals too operator: " + result);
		return result;
	}
	
	public boolean lessThanEqualsTo(int value1, int value2) {
		boolean result= value1>=value2;
		System.out.println("less-than equals to operator: " + result);
		return result;
	}
	
	
	
	

}
