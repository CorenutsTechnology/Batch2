//5. Write a program to reverse a string “CoreNuts Technologies Pvt ltd.” in different
//ways (on only string object)
package com.strings.nov24;

public class Reverse5 
{
	public String reverseOf(String string)
	{
		String reverse="";
		for(int index=string.length()-1;index>=0;index--)
		{
			reverse +=string.charAt(index);
		}
		return reverse;
	}
	
	public String reverseOf2(String string)
	{
		String reverse="";
		for(int index=0;index<=string.length()-1;index++)
		{
			reverse =string.charAt(index)+reverse;
		}
		return reverse;
	}
	
	public static void main(String[] args)
	{
		Reverse5 reverse5 = new Reverse5();
		System.out.println("reversed string is: "+reverse5.reverseOf("CoreNuts Technologies Pvt ltd"));
		System.out.println("reversed string is: "+reverse5.reverseOf2("CoreNuts Technologies Pvt ltd"));
	}
}
