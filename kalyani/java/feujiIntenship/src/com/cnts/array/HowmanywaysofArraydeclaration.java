package com.cnts.array;

public class HowmanywaysofArraydeclaration {

	public static void main(String[] args) {
		int[] value= {1,3,4};
		System.out.println(value[2]);
		
		HowmanywaysofArraydeclaration array=new HowmanywaysofArraydeclaration();
		
		array.intArray( new int[] {10,2,34,23,22});
	}
	public void intArray(int[] array) {
		int[] value=new int[3];
		value[0]=10;
		//value[1]=20;
		//value[2]=30;
		System.out.println(value[0]);
		System.out.println(array[3]);
		
	}

}
