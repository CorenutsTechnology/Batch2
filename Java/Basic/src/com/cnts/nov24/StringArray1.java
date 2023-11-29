package com.cnts.nov24;

public class StringArray1 {

	public static void main(String[] args) {
		 String str = "Corenuts Feuji";
		 char[] str1= str.toCharArray();
		 
		 System.out.println(str1);
		 
		 for(int i=0;i<str1.length; i++)
		 {
			 System.out.print(str1[i]+" ");
		 }
		 
	}
}
