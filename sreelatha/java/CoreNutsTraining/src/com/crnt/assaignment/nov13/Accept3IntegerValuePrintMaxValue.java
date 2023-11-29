package com.crnt.assaignment.nov13;

import java.util.Scanner;

public class Accept3IntegerValuePrintMaxValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value : ");
		int value1 = scan.nextInt();
		System.out.println("Enter second value : ");
		int value2 = scan.nextInt();
		System.out.println("Enter third value : ");
		int value3 = scan.nextInt();
		if (value1>value2 && value1>value3) {
			System.out.println("the largest number is : "+value1);
			
		}
		else if (value2>value3 && value2>value1)
		{
			System.out.println("the largest number is : "+value2);
		}
		else 
		{
			System.out.println("The largest number is : "+value3
					);
		}
		
	}

}
