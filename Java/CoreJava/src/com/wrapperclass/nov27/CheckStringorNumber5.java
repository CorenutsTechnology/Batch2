//5. Write a program to check given string value is string or number.

package com.wrapperclass.nov27;

public class CheckStringorNumber5 
{
	public static void main(String[] args) 
	{
		String s ="123a";
		try {
			Double d = Double.parseDouble(s);
			System.out.println("it is a number");
		}catch(NumberFormatException e)
		{
			System.out.println("it is string");
		}
	}
}
