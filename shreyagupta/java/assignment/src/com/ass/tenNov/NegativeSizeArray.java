package com.ass.tenNov;

public class NegativeSizeArray {
	
	public static void main(String[] args) {
		int[] integerArray=new int[-2];// we cannot declare negative size array,
		                              // if we do, we will get runtime exception i.e, 
		                             //NegativeArraySizeException.
		integerArray[0]=10;
		integerArray[1]=20;
	}

}
