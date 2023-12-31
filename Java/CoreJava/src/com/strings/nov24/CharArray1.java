package com.strings.nov24;

public class CharArray1 {

	public void convert(String str)
	{
		char[] charArray = new char[str.length()];
		for(int index=0;index<str.length();index++)
		{
			charArray[index]=str.charAt(index);
		}
		System.out.println("character array is: ");
		for(char ch : charArray)
		{
			System.out.print(ch+" ");
		}
	}
	public static void main(String[] args) 
	{
		CharArray1 obj = new CharArray1();
		obj.convert("corenuts");
	}

}
