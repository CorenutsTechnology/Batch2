// Write a program to raise ArithemticException and then handle that using try, catch blocks

package com.exception.nov17;

public class ArithmeticException2 {

	public void exception(int number)
	{
		try {
			int result = number/0;
			System.out.println("result: "+result);
		}catch(ArithmeticException e)
		{
			System.out.println("exception is handled");
		}
	}
	public static void main(String[] args) 
	{
		ArithmeticException2 arithmeticException = new ArithmeticException2();
		arithmeticException.exception(10);
	}

}
