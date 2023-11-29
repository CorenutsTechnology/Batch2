package com.cnts.nov15;

import java.util.Scanner;

public class SwitchWeekDay extends FinalVariable
{
	public static void main(String[] args) {
		
		  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0 to 6");
		int day1 = sc.nextInt();
		
		switch (day1) {
		case 0:
			System.out.println("Monday");
			System.out.println("Work-day");
			break;
		case 1:
			System.out.println("Tuesday");
			return;
		case 2:
			System.out.println("Wednesday");
			break;
		case 3:
			System.out.println("Thuresday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			System.out.println("It is a fun-day");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
		
		System.out.println();
	}
}
