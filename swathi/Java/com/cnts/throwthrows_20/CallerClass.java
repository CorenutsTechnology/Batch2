package com.cnts.throwthrows_20;

public class CallerClass {
	
	public void arrayException() throws ArrayIndexOutOfBoundsException {
		int[] arr= {1,3,5};
		for(int index=0;index<=3;index++) {
			System.out.println(arr[index]);
		}
	}

}
