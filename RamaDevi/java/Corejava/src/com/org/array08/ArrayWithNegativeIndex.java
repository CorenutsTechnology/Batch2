package com.org.array08;

import java.util.Arrays;

public class ArrayWithNegativeIndex {

	public static void main(String[] args) {
		int[] intArray=new int[-2];
		intArray[-1]=1;
		intArray[-2]=1;

		System.out.println(intArray[-1]);
	}

}
