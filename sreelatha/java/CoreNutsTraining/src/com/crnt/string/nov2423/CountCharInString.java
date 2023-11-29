package com.crnt.string.nov2423;

public class CountCharInString {
	public static void main(String[] args) {
		String str ="Hello";
		char ch ='l';
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (ch==c) {
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
