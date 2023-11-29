package com.crnt.nov0823;

public class PassByValue {
	public static void main(String[] args) {
		int value=10;
		
		PassByValue.test(value);
		System.out.println("main method value : "+value);
	}
	public static void test(int value)
	{
		value=value*2;
		System.out.println("method value : "+(++value));
	}

}
