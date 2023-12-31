package com.assignment.nov11;

import java.util.Scanner;

public class TimeTable {

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
		TimeTable timeTable = new TimeTable();
		timeTable.print(value1,value2);
	}

}
