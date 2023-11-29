package com.crnts.classPackage;

public class StringClass {

	static String str = "Corenuts Technologies Pvt ltd";

	static String str1 = "Google";
	static String str2 = "Youtube";

	public static void charArray(String str) {
		char[] cArray = str.toCharArray();
		System.out.println("String to char of Array (same ques no 7): ");
		for (int index = 0; index < cArray.length; index++) {
			System.out.print(cArray[index] + ", ");
		}
		System.out.println();
	}

	public static void convertLetters(String str) {
		System.out.println("converting letters 1st way: ");

		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
		System.out.println("\n");
		System.out.println("converting letters 2nd way: ");

		String rev = "";
		for (int index = 0; index < str.length(); index++) {
			rev = str.charAt(index) + rev;
		}

		System.out.print(rev);

	}

	public static void convertwords(String str) {
		System.out.println("converting words: ");
		String[] array = str.split(" ");
		String rev = "";
		for (int index = array.length - 1; index >= 0; index--) {
			rev = rev + " " + array[index];
		}
		System.out.print(rev);

	}

	public static void main(String[] args) {

		charArray("MS Dhoni");
		System.out.println("------------------------------------------");

		System.out.println("sub string index 0 to 21: " + str.substring(0, 21));
		System.out.println("------------------------------------------");

		System.out.println("comparing address of 2 strings: " + (str1 == str2));
		System.out.println("------------------------------------------");

		System.out.println("comparing values of 2 strings: " + str1.equals(str2));
		System.out.println("------------------------------------------");

		convertLetters(str);
		System.out.println();
		System.out.println("------------------------------------------");

		convertwords(str);
		System.out.println();
		System.out.println("==========================================================");
		

		System.out.println("***** String Buffer Questions ***** "+"\n");

		StringBuffer buffer = new StringBuffer(str);
		System.out.println("Delete word from String: " + buffer.delete(9, 21));

		System.out.println("Insert word from String: " + buffer.insert(9, "Technologies"));
		
		

	}

}
