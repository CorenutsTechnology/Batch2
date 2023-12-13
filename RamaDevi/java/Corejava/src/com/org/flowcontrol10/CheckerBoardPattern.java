package com.org.flowcontrol10;

import java.util.Scanner;

public class CheckerBoardPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows");
		int noOfRows=sc.nextInt();
		System.out.println("Enter how many colums");
		int noOfColumns=sc.nextInt();
		for(int rows=1;rows<=noOfRows;rows++)
		{
			for(int columns=1;columns<=noOfColumns;columns++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
