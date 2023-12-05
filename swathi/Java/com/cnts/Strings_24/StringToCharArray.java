package com.cnts.Strings_24;

import java.util.StringTokenizer;

public class StringToCharArray {
	
	//program1
	
	public void stringToCharArray(String input) {
		char[] charArray = new char[input.length()];
		for(int i=0;i<=input.length()-1;i++) {
			charArray[i]=input.charAt(i);
			
		}
		for(char c:charArray) {
			System.out.print(c+" ");
		}
		System.out.println();
		
	}
	//program5
	public void reverseString(String input) {
		String reverse=new String();
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
			
		}
		System.out.println(reverse);
	}
	
	
	public static void main(String[] args) {
		StringToCharArray stringToCharArray1=new StringToCharArray();
		stringToCharArray1.stringToCharArray("Hyper Text MarkUp Language");
		String s1="CoreNuts Technologies Pvt Ltd";
		//program2
		String s2=s1.substring(0, s1.indexOf("P"));
		System.out.println(s2);
		StringToCharArray reverseString1 = new StringToCharArray();
		stringToCharArray1.reverseString("CoreNuts Technologies Pvt Ltd");
		
		//program3 && program4
		String stringValue1=new String("CoreNuts Technologies");
		String stringValue2=new String();
		String stringValue3="";
		String stringValue4="swathi";
//		System.out.println(stringValue1==stringValue2);//it will compare address
//		System.out.println(stringValue3.toString());
//		//equals method will compare only values
//	    System.out.println(stringValue1.equals(stringValue2));//it will compare values
//	    System.out.println(stringValue3==stringValue4);//it will compare values
//	    System.out.println(stringValue3.equals(stringValue4));
	    System.out.println(stringValue3.isEmpty());
//	    System.out.println(stringValue2.contains(stringValue4));
	    System.out.println(stringValue2.isBlank());
		 
		
	}

}
