package com.arrays.nov8;

import java.util.Scanner;

public class WeekDay {

	public String checkDay(int number)
	{
		String result;
		switch(number)
		{
			case 0:
			{
				result="Sunday";
				break;
			}
			case 1:
			
				result="Monday";
				break;
			
			case 2:
			{
				result="Tuesday";
				break;
			}
			case 3:
			{
				result="Wednesday";
				break;
			}
			case 4:
			{
				result="Thursday";
				break;
			}
			case 5:
			{
				result="Friday";
				break;//continue will give compile time error
				//here we can use return also 
			}
			case 6:
			{
				result="Saturday";
				break;
			}
			default:
			{
				result="Invalid number";
			}
		}
		return result;	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the day:");
		int number = sc.nextInt();
		WeekDay weekDay = new WeekDay();
		String result = weekDay.checkDay(number);
		System.out.println("week day is: "+result);
	}

}
