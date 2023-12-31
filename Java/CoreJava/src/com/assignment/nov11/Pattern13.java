package com.assignment.nov11;

import java.util.Scanner;

public class Pattern13 
{
	void print(int value)
	{
		for(int index1=value;index1>0;index1--)
		{
			for(int index2=1;index2<=index1;index2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Pattern13 pattern13 = new Pattern13();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int value = sc.nextInt();
		pattern13.print(value);
	}
}
