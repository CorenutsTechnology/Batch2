package com.crnt.string.nov2423;

public class ReverseString {
	public static void main(String[] args) {
		String str = "corenuts technologies pvt ltd";
		String rev ="";
		for(int index=0;index<=str.length()-1;index++)
		{
			char c = str.charAt(index);
			
			rev=c+rev;
			
		}
		System.out.println("reverse of string : "+rev);
		
		System.out.println();
		System.out.println("original string  : "+str);
	}
	

}
