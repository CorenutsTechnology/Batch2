package com.crnuts.wrapperClass;

import java.util.Scanner;

public class StringOrNumberChecker {

	public static void main(String[] args) {
		System.out.println("-----------Ques 5------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = scanner.nextLine();

		System.out.println(isNumber(str) ? "The String value is number. " : "The String value is string.");

	}

	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
