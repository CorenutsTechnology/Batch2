package com.crnt.assaignment.nov13;

import java.util.Scanner;

public class MinMaxMarks {
	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
//		System.out.println("enter out of marks per subject : ");
//		int markPerSubject= scan.nextInt();
		int [] arr = new int[] {45,67,65,94,78,47};
		int large =arr[0];
		int small = arr[0];
		int largest=0;
		int smallest=0;
		int sum =0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index]>large) {
				largest = arr[index];
				
			}
			else if (arr[index]<small)
			{
				smallest =arr[index];
				
			}
			
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.println("largest value is : "+largest);
			System.out.println("Smallest value is : "+smallest);
			break;
			
		}
		for (int index = 0; index < arr.length; index++) {
			if (index<=arr.length) {
				
				sum=sum+arr[index];
				
			}
			
		}
		System.out.println("average of the marks : "+(sum/5));
		
			
		}
	}


