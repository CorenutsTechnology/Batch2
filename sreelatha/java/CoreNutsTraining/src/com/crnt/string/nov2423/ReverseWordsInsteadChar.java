package com.crnt.string.nov2423;

import java.util.Iterator;

public class ReverseWordsInsteadChar {
	public static void main(String[] args) {
		String str = "Corenuts Technologies Pvt Ltd";
		
		String [] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			//System.out.println(s[i]);
			String word =s[i];
			String rev="";
			for (int j = word.length()-1; j >=0; j--) {
				rev=rev+word.charAt(j);
				
			}
			System.out.println(rev);
		}
		
		
	}

}
