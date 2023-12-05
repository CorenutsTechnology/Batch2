package com.cnts.throwthrows_20;

public class CallerException {
	
	public void arrException() throws ArrayIndexOutOfBoundsException {
		int[] arr= {1,5,7};
		for(int index=0;index<=3;index++) {
			System.out.println(arr[index]);
		}
	}
	public static void main(String[] args) {
		CallerException callerException = new CallerException();
		try {
			callerException.arrException();
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
