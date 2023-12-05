package com.cnts.exceptions_17;

public class ArrayException2 implements Array1{
	
	

	@Override
	public void arrayIndex() {
		int[] arr= {1,3,5};
	try {
		for(int index=0;index<=3;index++) {
			System.out.println(arr[index]);
		}
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound exception "+e.getMessage());
		e.printStackTrace();
		
	}
		
	}
	public static void main(String[] args) {
		ArrayException2  arrayException2 =new ArrayException2 ();
		arrayException2.arrayIndex();
		
	}

}
