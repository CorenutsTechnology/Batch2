package com.cnts.nov17;

public class MultipelException6 {

	public static void main(String[] args) {
		try
		{
			int value1 = 100;
			int value2 = 0;
			int number = Integer.parseInt("anisha");
			
			System.out.println(value1/value2);
			System.out.println(number);
		}
		catch(ArithmeticException | IllegalArgumentException e)
		{
			System.out.println("exception occured");
		}
	}
}
