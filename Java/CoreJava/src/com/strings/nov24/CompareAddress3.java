package com.strings.nov24;

public class CompareAddress3 
{
	public static void main(String[] args) 
	{
		String string1 = "hello";
		String string2 = "hello";
		System.out.println(string1==string2);

		String string3 = new String("hello");
		System.out.println(string1==string3);
		System.out.println(string2==string3);
		
		String string4 = new String("hello");
		System.out.println(string3==string4);

		string2="hi";
		System.out.println(string1==string2);

	}
}
