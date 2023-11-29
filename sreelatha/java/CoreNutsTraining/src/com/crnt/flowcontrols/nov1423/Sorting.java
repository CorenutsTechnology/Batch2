package com.crnt.flowcontrols.nov1423;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int [] arr = {23,45,67,2,3,87};
		Arrays.sort(arr);
		for (int index=0;index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}
	}
	

}
