package com.feuji20nov;

import java.util.Scanner;

public class Student 
{
	//Scanner scan=new Scanner(System.in);
	public void marksAverage(int arr[])
	{
		int sum=0;
		for(int index=1;index<=arr.length-1;index++)
		{
			sum=sum+arr[index];
			System.out.println(arr[10]);
		}
		System.out.println("sum"+sum);
		double avg=sum/arr.length;
		System.out.println("avg"+avg);
	}
	

}
