package com.cnuts.operator;

public class UnaryOperators {
	
	//++,--, +,-,!
	
	public int increment(int value1,int value2) {
		int result=(value1++)+(++value2);
		System.out.println("post and pre increment result: "+result);
		return result;
	}
	
	public int decrement(int value1,int value2) {
		value1--;
		int result=value1+(--value2);
		System.out.println("post and pre decrement result: "+result);

		return result;
	}
	
	public int plusUnary(int x) {
		x= +x;
		System.out.println("plus unary operator: "+x);
		return x;
	}
	
	public int minusUnary(int x) {
	
		System.out.println("minus unary operator: "+(-x));
		return -x;
	}
	
	public void notEqual(int x) {
		int y=10;
		System.out.println( "NOT EQUAL unary oerator: "+(!(y==x)));
		
	}
	
	

}
