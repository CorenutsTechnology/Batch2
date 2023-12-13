package com.org.string24;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Corenuts Technologies Pvt Ltd";
		char[] charArray = name.toCharArray();
		for (int index = charArray.length - 1; index >= 0; index--)

		{
			System.out.print(charArray[index]);
		}
	}
}
