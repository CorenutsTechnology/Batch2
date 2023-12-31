package com.assignment.nov11;

import java.util.Scanner;

public class MaxAndMin6 
{
	void checkMinMax(int[] array)
	{
		for(int index1=0;index1<array.length;index1++)
		{
			for(int index2 = index1;index2<array.length;index2++)
			{
				if(array[index1] > array[index2])
				{
					int temp =array[index1] ;
					array[index1] =array[index2];
					array[index2]=temp; 
				}
			}
		}
		
		System.out.println("Maximum number is: "+array[array.length-1]);
		System.out.println("Minimum number is: "+array[0]);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values into array ");
		int[] array = new int[5];
		for(int index=0;index<array.length;index++)
		{
			array[index]=sc.nextInt();
		}
		MaxAndMin6 maxAndMin6 = new MaxAndMin6();
		maxAndMin6.checkMinMax(array);
	}
}
