package com.cnts.nov20;

public class CheckedException_1 {
	public static void main(String[] args) 
	{
		CheckedException_1 exception = new CheckedException_1();

		try {
			exception.calculator(32,0);
		}
		catch (Exception e) {
			System.out.println("EXCEPTION OCCURED");
		}
	}

	public void calculator(int value1, int value2) throws Exception {
		Class.forName("Test.java");
		
		throw new MyException_1("throw MyException");
//		System.out.println(value1/value2);       //UnReachabel Code
	
	}
}
