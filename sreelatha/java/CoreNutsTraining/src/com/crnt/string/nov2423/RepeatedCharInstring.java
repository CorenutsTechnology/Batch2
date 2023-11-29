package com.crnt.string.nov2423;

import java.util.Iterator;

public class RepeatedCharInstring {
	public static void main(String[] args) {
		String str="Hellooo";
		char [] a = str.toCharArray();
		String s2="";
		
		for (int i = 0; i < a.length; i++) {
			int isPresent=0;
			for (int j = i; j >=0; j--) {
				if (a[i]==a[j]) {
					isPresent++;
					
				}
				
			}
			if (isPresent>1) {
				s2=s2+a[i];
				System.out.println(s2);
				
				
				
			}
			
		}
		
	}

}
