package com.exception.nov17;

public class NullPointerException7 
{
	String str=null;
	public static void main(String[] args) 
	{
		NullPointerException7 object = new NullPointerException7();
		object.exceptionMethod();
	}

	public void exceptionMethod() 
	{
		System.out.println(str.charAt(0));//it throws NullPointerException
	}
}
