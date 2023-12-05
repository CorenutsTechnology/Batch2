package com.feuji.operators_09;

public class TerenaryOperator {
	
	public String terenaryString(int value1,int value2) {
		
		String res=(value1>value2)?"value1 is greater":"value2 is greater";
		return res;
	}
public String terenaryEvenOrOdd(int value1) {
		
		String res=(value1%2==0)?"given value is even":"given value is odd";
		return res;
	}
	
	
	
	public static void main(String[] args) {
		TerenaryOperator  terenaryOperator = new TerenaryOperator();
		System.out.println(terenaryOperator.terenaryString(10, 25));
		System.out.println(terenaryOperator.terenaryEvenOrOdd(26));
	}
	

}
