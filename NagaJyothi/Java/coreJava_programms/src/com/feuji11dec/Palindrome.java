package com.feuji11dec;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Palindrome {
	public static boolean palindrome(String value) {
		String reverse = "";
		String temp = value;
		System.out.println(temp);
//		while (value != null) {
			for (int i = value.length()-1; i >= 0; i--) {
				reverse = reverse + value.charAt(i);
			}
		
		System.out.println(reverse);

		//System.out.println("Reverse no:" + reverse);
		if (temp.equals(reverse)) {
			//System.out.println("Given no is palindrome");
			return true;
		} 
		else
			return false;
	}

	public static void main(String[] args) {
		//System.out.println(palindrome("AmmA"));
		Predicate<String> p = Palindrome::palindrome;
		System.out.println(p.test("AmmA"));
	}

}
