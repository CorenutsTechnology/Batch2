package com.cnts.array;

public class NegativeSizeArray {

	public static void main(String[] args) {
		NegativeSizeArray array=new NegativeSizeArray();
		array.intArray();

	}
	public void intArray() {
		int[] value=new int[-3];
		value[-1]=10;
		value[1]=20;
		value[2]=30;
		System.out.println(value[-1]);
	}

}
