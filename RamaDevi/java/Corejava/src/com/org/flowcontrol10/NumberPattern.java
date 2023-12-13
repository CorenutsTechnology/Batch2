package com.org.flowcontrol10;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows");
		int NoOfrows=sc.nextInt();
		for(int rows=1;rows<=NoOfrows;rows++)
		{
			for(int value=1;value<=rows;value++)
			{
				System.out.print(value);
			}
			System.out.println();
		}

	}

}
