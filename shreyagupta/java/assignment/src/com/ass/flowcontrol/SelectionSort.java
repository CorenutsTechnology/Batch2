package com.ass.flowcontrol;

public class SelectionSort {
	
	
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	      
	        for (int index1 = 0; index1 < n - 1; index1++) {
	            
	            int minIndex = index1;
	            for (int index2 = index1 + 1; index2 < n; index2++) {
	                if (arr[index2] < arr[minIndex]) {
	                    minIndex = index2;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[index1];
	            arr[index1] = temp;
	        }
	    }

	    public static void printArray(int[] arr) {
	       
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        System.out.println("Original array:");
            printArray(arr);

	        selectionSort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }

}
