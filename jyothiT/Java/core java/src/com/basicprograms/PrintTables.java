package com.basicprograms;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		
		final byte a=2;
		final byte b=5;
		byte c=(a+b);
		System.out.println(c);
		
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no of tables");
		long count=sc.nextInt();
		
	    System.out.println("enter the final multiplication value");
		long value=sc.nextInt();
		tables(count, value);
		
}
	static void tables(long count, long value)
	{
		for(int index=1;index<=count;index++)
		{
			for(int index2=1;index2<=value;index2++)
			{
				System.out.println(index+"*"+index2+"="+(index*index2));
			}
			System.out.println();
		}
	}
}
