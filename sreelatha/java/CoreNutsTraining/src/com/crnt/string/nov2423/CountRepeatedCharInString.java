package com.crnt.string.nov2423;

public class CountRepeatedCharInString {
	public static void main(String[] args) {
		String str ="moommmma";
		int count=0;
		char [] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				
				if(c[i]!=c[j])
				{
					count++;
				}
			}
			
			
			
		}
		for (int i = 0; i < c.length; i++) {
			if (count>=2) {
				System.out.println(count+"  "+c[i]);
				
			}
		}
		
	}

}
