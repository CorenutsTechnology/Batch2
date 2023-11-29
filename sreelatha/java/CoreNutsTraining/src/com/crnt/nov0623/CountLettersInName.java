package com.crnt.nov0623;

import java.util.Scanner;

public class CountLettersInName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String name1 = scan.nextLine();
		int count=0;
		System.out.println("Enter character which we want");
		char  charValue = scan.next().charAt(0);
		//char [] charValue=name1.toCharArray();
		for (int index=0 ; index<=name1.length()-1;index++)
		{
			char ch = name1.charAt(index);
			if(ch==charValue)
			{
				count++;
			}
			
			
			
			
		}
		System.out.println(charValue+ " = "+count);
		
			
		
			
		
		
	}

}
