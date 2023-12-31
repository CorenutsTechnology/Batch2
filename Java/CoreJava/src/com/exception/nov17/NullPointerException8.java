package com.exception.nov17;

public class NullPointerException8 
{
	String str;
	public static void main(String[] args) 
	{
		NullPointerException8 object = new NullPointerException8();
		object.exceptionMethod();
	}

	public void exceptionMethod() 
	{
		try {
			System.out.println(str.charAt(0));
		}catch(NullPointerException e)
		{
			System.out.println("NullPointerException is handled");
		}
	}
}
