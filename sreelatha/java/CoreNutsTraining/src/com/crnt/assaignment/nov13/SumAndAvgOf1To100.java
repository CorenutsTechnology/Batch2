package com.crnt.assaignment.nov13;

import java.util.Scanner;

public class SumAndAvgOf1To100 {
	public static void main(String[] args) {
		int sum=0;
		int num=100;
		
		for (int value =1;value<=num ;value++)
		{
			sum =sum+value;
		}
		System.out.println("The sum is : "+sum);
		System.out.println("The average is    "+(sum/num));
	}

}
