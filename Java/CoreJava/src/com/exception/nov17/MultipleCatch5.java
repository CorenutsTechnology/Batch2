//5. Write a program to handle multiple/specific exceptions using different catch blocks

package com.exception.nov17;

public class MultipleCatch5 {

	public void exceptionMethod() 
	{
		
		try {
			int[] array = new int[5];
			System.out.println(array[5]);
			int result = 10/0;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is handled");
		}
		catch(Exception e)
		{
			System.out.println("exception is handled");
		}
	}
	public static void main(String[] args)
	{
		MultipleCatch5 multipleCatch5 = new MultipleCatch5();
		multipleCatch5.exceptionMethod();
	}

	

}
