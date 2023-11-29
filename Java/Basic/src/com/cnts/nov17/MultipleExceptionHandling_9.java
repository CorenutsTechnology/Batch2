package com.cnts.nov17;

public class MultipleExceptionHandling_9 {

	public static void main(String[] args) 
	{
		try {
			System.out.println("Try-Block");
			int result = divideByZero();          //ArithmeticException
			
			arraySize();                          //ArrayIndexOutOfBoundsException
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("First Exception occured....");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Second Exception occured....");
		}
		finally
		{
			System.out.println("Finally-block executed");
		}
	}
	
	static int divideByZero()
	{
		int value1=28;
		int value2=0;
		return value1/value2;
	}
	
	static int arraySize()
	{
		int[] array = new int[5];
		return array[6];
	}
}
