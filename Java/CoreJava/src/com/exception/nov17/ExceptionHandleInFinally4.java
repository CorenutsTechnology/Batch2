// Write a program to handle the exception in finally without using catch block?

package com.exception.nov17;

public class ExceptionHandleInFinally4 {

	public static void main(String[] args) 
	{
		try {
			
		}
		finally {
			int[] array = new int[5];
			try {
				System.out.println(array[5]);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exception is handled");
			}
			
		}
	}

}
