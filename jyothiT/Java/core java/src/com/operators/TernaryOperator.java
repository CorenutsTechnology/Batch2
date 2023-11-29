package com.operators;

public class TernaryOperator {
	
	public void ternary(int value1,int value2)
	{
		System.out.println((value1>value2)?true:false);
	}

	public static void main(String[] args) {
		
     TernaryOperator ternaryOperator=new TernaryOperator();
     ternaryOperator.ternary(30, 20);
	}

}
