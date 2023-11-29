package com.ass.flowcontrol;

public class BubbleSort {

	public static void main(String[] args) {
		int[] integerArray = { 66, 24, 34, 51, 23, 44 };
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.shortingMaxToMin(integerArray);
		bubbleSort.shortingMinToMax(integerArray);
	}

	
	public void shortingMaxToMin(int[] integerArray) {
		for (int ArrayIndex1 = 0; ArrayIndex1 < integerArray.length; ArrayIndex1++) {

			for (int ArrayIndex2 = 0; ArrayIndex2 < integerArray.length; ArrayIndex2++) {

				if (integerArray[ArrayIndex1] > integerArray[ArrayIndex2]) {

					int tempArray = integerArray[ArrayIndex1];

					integerArray[ArrayIndex1] = integerArray[ArrayIndex2];

					integerArray[ArrayIndex2] = tempArray;
				}
			}

		}

		System.out.println("shorting integer array from max to min: ");

		for (int index = 0; index < integerArray.length; index++) {
			System.out.print(integerArray[index] + " ");
		}
		System.out.println();
	}

	public void shortingMinToMax(int[] integerArray) {
		for (int ArrayIndex1 = 0; ArrayIndex1 < integerArray.length; ArrayIndex1++) {
			
			for (int ArrayIndex2 = 0; ArrayIndex2 < integerArray.length; ArrayIndex2++) {
				
				if (integerArray[ArrayIndex1] < integerArray[ArrayIndex2]) {
					
					int tempArray = integerArray[ArrayIndex1];
					
					integerArray[ArrayIndex1] = integerArray[ArrayIndex2];
					
					integerArray[ArrayIndex2] = tempArray;
					
				}
			}

		}

		System.out.println("shorting integer array from min to max: ");

		for (int index = 0; index < integerArray.length; index++) {
			System.out.print(integerArray[index] + " ");
		}
	}

}
