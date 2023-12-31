package com.assignment.nov11;

import java.util.Scanner;

public class MaxOfThree5 
{
	int findMax(int value1 , int value2, int value3)
	{
		if(value1>value2)
		{
			if(value1>value3)
				return value1;
			else
				return value3;
		}
		else if(value2 > value3)
		{
			return value2;
		}
		else
		{
			return value3;
		}
			
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three NUmbers ");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		MaxOfThree5 maxOfThree5=new MaxOfThree5();
		System.out.println("Maximum number is: "+maxOfThree5.findMax(value1,value2,value3));
	}
}
