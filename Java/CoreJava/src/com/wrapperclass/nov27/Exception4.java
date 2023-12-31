//4. Write a program to throw NumberFormatException while converting from string to
//     primitive values.

package com.wrapperclass.nov27;

public class Exception4 
{
	public static void main(String[] args)
	{
		try {
			String s ="456abc";
			int i =Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException is throwed and handled");
		}
	}
}
