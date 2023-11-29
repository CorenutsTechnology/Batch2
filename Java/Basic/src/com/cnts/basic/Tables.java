package com.cnts.basic;

import java.util.Scanner;
//class program to print table
public class Tables {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Print table from ");
		int num = sc.nextInt();
		System.out.print(" to ");
		int num2 = sc.nextInt();
		Tables tables = new Tables();
		tables.print(num, num2);
		
	}
    
	//	this method is used to print table using for loop
	public void print(int start,int end)
	{
		for (int table = start; table <= end; table++) {
			for (int index = 1; index <= end; index++) {
				System.out.println(table+" * "+index+" = "+(table*index));
			}
			System.out.println("----------------");
		}
	}
}
