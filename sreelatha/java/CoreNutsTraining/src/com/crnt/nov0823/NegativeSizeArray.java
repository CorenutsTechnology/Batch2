package com.crnt.nov0823;

public class NegativeSizeArray {
	public static void main(String[] args) {
		int [] intArray = new int[-3];
		intArray[0]=3;
		intArray[1]=23;
		intArray[2]=33;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		
	}

}
