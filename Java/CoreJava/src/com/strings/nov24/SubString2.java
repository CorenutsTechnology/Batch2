package com.strings.nov24;

public class SubString2
{
	public void convert(String string, int start, int end)
	{
		String subString="";
		for(int index=0;index<end;index++)
		{
			subString += string.charAt(index);
		}
		System.out.println("sub string is: "+subString);
	}
	public static void main(String[] args)
	
	{
		SubString2 obj = new SubString2();
		String string1 = "corenuts technologies pvt ltd";
		obj.convert(string1,0,21);
		
//		String subString = string1.substring(0,21);
//		System.out.println("sub string is: "+subString);
		
	}
}
