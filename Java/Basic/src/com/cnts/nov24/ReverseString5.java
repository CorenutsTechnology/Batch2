package com.cnts.nov24;

public class ReverseString5 
{
	static String string = "CoreNuts Technologies Pvt ltd";
	
	//First Way
	public static String reverse(String str)
	{
		char[] charray = string.toCharArray();
		String reverseString="";
		
		for(int index=charray.length-1;index>=0;index--)
		{
			reverseString+=charray[index];
		}
		return reverseString;
	}
	
public static void main(String[] args) {
	System.out.println("Reverse type 1: "+ReverseString5.reverse(string));	
	
	//second way
	StringBuffer buffer = new StringBuffer(string);
	System.out.println("Reverse type 2: "+buffer.reverse());
	}
}
