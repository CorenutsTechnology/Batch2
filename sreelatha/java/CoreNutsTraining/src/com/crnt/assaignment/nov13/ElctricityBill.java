package com.crnt.assaignment.nov13;

import java.util.Scanner;

public class ElctricityBill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of units consumed..");
		int units = scan.nextInt();
		if (units <=0 && units<=50) {
			System.out.println("charge for minimum usage  :  250");
			System.out.println();
			
		} 
		else if (units>50 && units<=100)
		{
			System.out.println("charge for moderate usage : "+(units*5));
		}
		else {
			
			System.out.println("charge for high usage : "+(units*8));
		}
	}

}
