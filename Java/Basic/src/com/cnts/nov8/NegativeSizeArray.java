package com.cnts.nov8;

import java.util.Arrays;

public class NegativeSizeArray 
{
	public static void main(String[] args) {
/*		
		if we pass array size as negative it will give
		NegativeArraySizeException
*/		
		int[] array = new int[-5];        
		
		System.out.println(array.length);    //  NegativeArraySizeException
		array[0]=1;
		array[1]=4;
		array[2]=3;
		array[3]=5;
		
//		System.out.println(Arrays.toString(array));
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
	}
}
