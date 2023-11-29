package com.cnts.array;

public class ArrayOutOfBoundXException {

	public static void main(String[] args) {
		ArrayOutOfBoundXException array=new ArrayOutOfBoundXException();
		array.intArray();

	}
	public void intArray() {
		int [] value=new int [3];
		value[0]=10;
		value[1]=20;
		value[2]=30;
		System.out.println(value[4]);
		
	}

}
