package com.operators.nov9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1=10 ;
		int value2=20;
		int value3=30;
		System.out.println(10 & 1);
		if((value1>20)&&(value2++ >10))
			System.out.println(value2);
		else
			System.out.println(value2);
		
		if((value1>20)&(value3++ >10))
		{	
			System.out.println(value3);
		}
		else
		{
			System.out.println(value3);
			System.out.println("bit: "+(0 & 31));
		}
	}

}
