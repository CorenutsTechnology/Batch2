package com.cnts.nov10loops;

import java.util.Scanner;

public class TimeTable15 {

	void print(int value1 , int value2)
	{
		for(int index1 = 1;index1<=value1;index1++)
		{
			System.out.print(index1+"|");
			for(int index2 = 1;index2<=value2;index2++)
			{
				System.out.print(index1*index2+" ");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value1:");
		int value1 = sc.nextInt();
		System.out.println("Enter value2:");
		int value2 = sc.nextInt();
		TimeTable15 timeTable = new TimeTable15();
		timeTable.print(value1,value2);
		
		sc.close();
	}

}
