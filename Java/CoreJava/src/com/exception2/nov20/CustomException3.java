//3. Write a program to raise the user defined exception from catch block?

package com.exception2.nov20;

public class CustomException3 
{
	public void calculate(int value1 , int value2) throws CustomException
	{
		System.out.println("calculate is started");
		try {
			int result = value1/value2;
			System.out.println("result is: "+result);
		}catch(ArithmeticException e)
		{
			e.getMessage();
			throw new CustomException("this is new custom exception raised in catch");
		}
		System.out.println("calculate is ended");
	}
	public static void main(String[] args) 
	{
		try {
			CustomException3 customException3 = new CustomException3();
			customException3.calculate(10,0);
		}catch(CustomException e) {
			System.out.println(e);
		}
	}
}
