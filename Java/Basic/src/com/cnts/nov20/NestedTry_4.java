package com.cnts.nov20;

public class NestedTry_4 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("First try-block");
			int[] array = {1,4,5,7};
//			System.out.println(array[6]);
			try
			{
				System.out.println("Inner try-block");
				System.out.println(array[3]/0);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Inner catch-block");
				System.out.println("Exception Handeled");
			}
		} catch (Exception e)
		{
			System.out.println("Outer catch-block");
		}
	}
}
