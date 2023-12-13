package com.org.flowcontrol10;

import java.util.Scanner;

public class ReverseTriAngle {
	public void reverseTriangle(int noOfRows)
	{
		for(int rows=1;rows<=noOfRows;rows++)
		{
			for(int columns=noOfRows;columns>=rows;columns--)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows");
		int noOfRows=sc.nextInt();
//		System.out.println("Enter how many colums");
//		int noOfColumns=sc.nextInt();
		ReverseTriAngle  reverseTriAngle=new ReverseTriAngle();
		reverseTriAngle.reverseTriangle(7);
		
	}

}
