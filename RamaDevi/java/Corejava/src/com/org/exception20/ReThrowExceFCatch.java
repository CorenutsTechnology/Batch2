package com.org.exception20;

public class ReThrowExceFCatch {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		try
		{
	String name="rama";
	System.out.println(name);
	System.out.println(name.charAt(5));
	
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("handled");
			throw  new StringIndexOutOfBoundsException();
		}
		System.out.println("main end");
	}

}
