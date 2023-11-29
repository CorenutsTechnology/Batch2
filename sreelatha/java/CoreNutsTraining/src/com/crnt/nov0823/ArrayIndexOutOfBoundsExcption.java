package com.crnt.nov0823;

public class ArrayIndexOutOfBoundsExcption {
	public static void main(String[] args) {
		int [] intArr = new int[2];
		intArr[0]=23;
		intArr[1]=13;
		
		intArr[2]=33;
		System.out.println(intArr[2]);
		
		
	}

}
