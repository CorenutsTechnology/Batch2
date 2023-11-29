package com.crnt.assaignment.nov13;

public class MaxAndMinValueInIntArray {
	public static void main(String[] args) {
		int [] arr = new int[] {4,6,7,3,27,2};
		int large = arr[0];
		int small=arr[0];
		int largest =0;
		int smallest =0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index]>large) {
				largest = arr[index];
				
			}
			else if (arr[index]<small)
			{
				smallest =arr[index];
				
			}
			
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.println("largest value is : "+largest);
			System.out.println("Smallest value is : "+smallest);
			break;
			
		}
		
	}

}
