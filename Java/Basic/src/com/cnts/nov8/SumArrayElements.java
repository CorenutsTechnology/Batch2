package com.cnts.nov8;

public class SumArrayElements 
{
	public static void main(String[] args) {
		int[] intArray = {2,5,8,4,7};
		int sum = 0;
//		sum = sum(intArray,0);
		  
		sum = intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4];
		System.out.println("The sum is :"+sum);
	}
	
//	public static int sum(int[] array ,int index)
//	{
//		// If the index is at the end of the array, return the sum.
//		if (index == array.length) {
//		      return 0;
//		    }
//
//		// Otherwise, add the current element to the sum and return the sum.
//	     return array[index] + sum(array, index + 1);  //recurssion 
//	}
}
