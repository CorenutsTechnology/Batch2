//Write a Java program to implement a lambda expression to check if a given String is a palindrome.
package com.crnts.FunctionalInterfaceAssignment;

import java.util.function.Predicate;

public class PalindromeString {

	public static void main(String[] args) {
		PalindromeString palindromeString=new PalindromeString();
		palindromeString.checkPalindrome();
	}
	public void checkPalindrome()
	{ Predicate<String> word=(e1)->{
			 String rev="";
			for(int index=e1.length()-1;index>=0;index--)
			 {  rev=rev+e1.charAt(index);
			  
			 }return rev.equals(e1);
		  };System.out.println(word.test("wooooow"));
//		  System.out.println(even.test("rakhi"));
	}

}
