package com.cnts.nov27.wrraperclass;

import java.util.Scanner;

public class StringToNumber5 {

	public static void main(String[] args) {
		
		//one way
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value: ");
		String string = sc.next();
		
//		boolean isNumber = true;
//        for (int i = 0; i < string.length(); i++) 
//        {
//            if (!Character.isDigit(string.charAt(i)))
//            {
//                isNumber = false;
//                break;
//            }
//        }
//        
//        if(isNumber)
//        	System.out.println("The input String is number");
//        else 
//        	System.out.println("The input string is String");
        
        //2nd way
        try {
        	Integer integer = Integer.parseInt(string);
        	System.out.println("The input String is number");
		} 
        catch (Exception e)
        {
			System.out.println("The input string is String");
		}
	}
}
