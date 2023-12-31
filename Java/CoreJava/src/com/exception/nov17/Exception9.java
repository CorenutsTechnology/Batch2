package com.exception.nov17;

public class Exception9 
{
	public static void main(String[] args) 
	{
		Exception9 object = new Exception9();
		object.exceptionMethod();
	}

	public void exceptionMethod() 
	{
		try {
			
			try {
				int result = 10/0;
				System.out.println(result);
				}catch( ArithmeticException e) 
			{
					System.out.println("ArithmeticException is handled");
			}
			int[] array = new int[5];
			System.out.println(array[5]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
	}
}
