package com.assignment.nov11;

import java.util.Scanner;

public class SquareBoard11 
{
	void print(int value)
	{
		for(int index=1;index<=value;index++)
		{
			for(int index2=1;index2<=value;index2++)
			{
				System.out.print("# ");
			}
			System.out.println();			
		}
	}
	public static void main(String[] args) 
	{
		SquareBoard11 squareBoard11 = new SquareBoard11();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int value = sc.nextInt();
		squareBoard11.print(value);
	}
}
