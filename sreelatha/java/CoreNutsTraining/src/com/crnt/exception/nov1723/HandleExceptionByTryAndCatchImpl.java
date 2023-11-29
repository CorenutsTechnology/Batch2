package com.crnt.exception.nov1723;

public class HandleExceptionByTryAndCatchImpl implements HandleExceptionByTryAndCatch{

	@Override
	public int ArrayIndexOBException() {
		int [] arr = new int[] {2,3,45,67,8};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[4]);
			
		}
		return arr[4];
	}

}
