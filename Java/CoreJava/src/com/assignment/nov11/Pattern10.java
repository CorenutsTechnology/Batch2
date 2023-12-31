package com.assignment.nov11;

import java.util.Scanner;

public class Pattern10 {

	void print(int value)
	{
		for(int index=1;index<=value;index++)
		{
			for(int index2=1;index2<=index;index2++)
			{
				System.out.print(index2+" ");
			}
			System.out.println();			
		}
	}
	public static void main(String[] args) 
	{
		Pattern10 pattern10 = new Pattern10();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int value = sc.nextInt();
		pattern10.print(value);
	}

}
