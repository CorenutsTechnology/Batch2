package com.crnt.nov0623;

import java.util.Iterator;
import java.util.Scanner;

public class PrintingTables {
	//printing tables upto where we want based on given input 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number upto to which table you want : ");
		long input1=scan.nextLong();
		System.out.println("Enter number upto to which row you want : ");
		long input2 =scan.nextLong();
		
		for(int index=0;index<=input1;index++)
		{
			for(int index1 =0 ; index1<=input2;index1++)
			{
				System.out.println(index1 +" x "+index+ " = "+(index1*index));
			}
			System.out.println("..............................");
			
			
		}
		
	}

}
