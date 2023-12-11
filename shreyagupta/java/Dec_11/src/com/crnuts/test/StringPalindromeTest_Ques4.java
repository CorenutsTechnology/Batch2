package com.crnuts.test;

import java.util.function.Predicate;

public class StringPalindromeTest_Ques4{

	public static void main(String[] args) {
		String str = "saspp";

		Predicate<String> isPalindrome = (s) -> {
			String rev = "";
			for (int index = 0; index < s.length(); index++) {
				rev = s.charAt(index) + rev;
			}

			return rev.equals(s);
		};

		if (isPalindrome.test(str)) {
			System.out.println("'" + str + "' is a palindrome.");
		} else {
			System.out.println("'" + str + "' is not a palindrome.");
		}
	}
}
