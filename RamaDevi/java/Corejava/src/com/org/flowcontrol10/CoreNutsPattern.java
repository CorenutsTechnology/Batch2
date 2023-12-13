package com.org.flowcontrol10;

public class CoreNutsPattern {

	public static void main(String[] args) {
		String input="corenuts";
		for(int rows=0;rows<input.length();rows++)
		{	
		for(int columns=0;columns<=rows;columns++)
		{
			System.out.print(input.charAt(columns));
		}
		System.out.println();
		}
	
	}
}
