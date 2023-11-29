package com.ass.flowcontrol;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 7;

		int result = binarySearch(arr, target);

		if (result != -1) {
			System.out.println("Element found at index " + result);
		} else {
			System.out.println("Element not found in the array");
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = arr[mid];

			if (guess == target) {
				return mid; // Target found
			} else if (guess < target) {
				low = mid + 1; // Discard the lower half
			} else {
				high = mid - 1; // Discard the upper half
			}
		}

		return -1; // Target not found
	}

	

}
