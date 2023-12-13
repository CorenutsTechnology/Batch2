package com.org.exception17;

public class MultipleTryCatchFinally {
	public void multipleTCF()
	{
		System.out.println("start");

	try
	{
	String name=null;
	System.out.println(name.charAt(0));	
	}
	catch(NullPointerException e)
	{
		System.out.println("nullPointer");
	}
	finally
	{
		System.out.println("nullFinally");
	}
	try
	{
		int result=10/0;
		System.out.println(result);
	}
	  catch (ArithmeticException e) {
		System.out.println("division by zero");
		}
	finally
	{
		System.out.println("arthimaticFinally");
	}
		try
		{
			int[] array= {4,6,2,8,9};
			System.out.println(array[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("arrayIndex");
		}
		finally
		{
			System.out.println("arrrayFinally");
		}
	
	System.out.println("end");
	}
	public static void main(String[] args) {
		MultipleTryCatchFinally multipleTryCatchFinally=new MultipleTryCatchFinally();
		multipleTryCatchFinally.multipleTCF();

	}

}
