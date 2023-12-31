//5. Write a program to re-throw same exception from catch block.

package com.exception2.nov20;

public class ReThrowException5 {

	public void calculate(int value1 , int value2) throws ArithmeticException
	{
		System.out.println("calculate method  is started");
		try {
			int result = value1/value2;
			System.out.println("result is: "+result);
		}catch(ArithmeticException e)
		{
			System.out.println("helo");
//			throw new ArithmeticException("this is new custom exception raised in catch");
			throw e;
		}
		
		System.out.println("calculate is ended");
		
	}
	
	public static void main(String[] args) 
	{
		ReThrowException5 reThrowException = new ReThrowException5();
		try {
			reThrowException.calculate(10,0);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
