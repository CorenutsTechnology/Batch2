package com.feuji17nov;

public class ExceptionUsingFinallyClass implements ExceptionUsingFinally
{
	String name;
	@Override
	public void nullPointerException() 
	{
		//String name;
		try
		{
			System.out.println(name.charAt(0));
		}
		//Run time exception is occured .
		/*
		 * catch (NullPointerException e) { System.out.println("catch block");
		 * 
		 * }
		 */
		finally
		{
			System.out.println("Finally block");
		}
		
	}
	public static void main(String[] args)
	{
		ExceptionUsingFinallyClass result=new ExceptionUsingFinallyClass();
		result.nullPointerException();
		
	}
	

}
