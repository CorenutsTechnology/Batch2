package com.feuji_08;

public class IntArray {
	
	
	public int[] values(int[] intArr) {
		
//		intArr[0]=10;
//		intArr[1]=20;
//		intArr[2]=30;
//		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
	    System.out.println(intArr[2]);
	
	return intArr;
		
		
		
	}
	public static void main(String[] args) {
		//int[] intArr = {10,20,30};
		//int[] intArr = new int[3];
		IntArray array = new IntArray();
		array.values(new int[] {10,20,30,40,50});//anonymous function
		
				
		
		
	}
	
	
}
