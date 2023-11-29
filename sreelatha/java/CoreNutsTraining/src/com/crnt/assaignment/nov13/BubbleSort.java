package com.crnt.assaignment.nov13;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleTest();
		
	}
	public void bubbleTest()
	{
		int [] arr = {23,56,45,2,3,4,900};
		for (int index1 = 0; index1 <=arr.length; index1++) {
			for (int index2 = 0; index2 < arr.length-index1-1; index2++) {
				if (arr[index2]>arr[index2+1]) {
					
					int temp=arr[index2];
					arr[index2]=arr[index2+1];
					arr[index2+1]=temp;
					
					
				}
				
				
			}
			
		}
		for (int index1 = 0; index1 < arr.length; index1++) {
			System.err.println(arr[index1]);
			
		}
		
	}

}
