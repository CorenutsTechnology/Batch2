package com.cnuts.operator;

public class TernaryOperator {
	public static void main(String[] args) {
		
		int value1=5;
		int value2=30;
		int value3=75;
		
		System.out.println("Greatest number between three numbers using Ternary Operator");
		
		System.out.println("value1: "+value1);
		System.out.println("value2: "+value2);
		System.out.println("value3: "+value3);
		
		
		System.out.println((value1>=value2&&value1>=value3)?"value1 is greatest number":value2>=value3?"value2 is greatest number":"value3 is greatest number");
	}
	
}
