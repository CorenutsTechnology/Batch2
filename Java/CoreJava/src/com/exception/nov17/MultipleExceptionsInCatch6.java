package com.exception.nov17;

public class MultipleExceptionsInCatch6 {

	public static void main(String[] args) 
	{
		MultipleExceptionsInCatch6 object = new MultipleExceptionsInCatch6();
		object.exceptionMethod();
	}

	public void exceptionMethod() 
	{
//		boolean flag=false;
		try {
			int[] array = new int[5];
			System.out.println(array[5]);
			int result = 10/0;
			System.out.println(result);

		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("exception is handled");
//			 flag = true;
		}
		
		
	}

}
