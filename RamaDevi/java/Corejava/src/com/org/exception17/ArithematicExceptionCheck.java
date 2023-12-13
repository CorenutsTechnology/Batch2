package com.org.exception17;

public class ArithematicExceptionCheck {
	public void arthimatic(int[]array)
	{
		System.out.println("********");
		try
		{
		int value=89;
		System.out.println("try block");
		int result=value/array.length;
		}
//		
		finally
		{
	   System.out.println("finally");
		}
		System.out.println("********");
	}
	public static void main(String[] args) {
		int[] array= {};
		ArithematicExceptionCheck arthematiccheck=new ArithematicExceptionCheck();
		arthematiccheck.arthimatic(array);
	}
}
