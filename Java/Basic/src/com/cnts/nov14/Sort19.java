package com.cnts.nov14;

import java.util.Scanner;

public class Sort19 {

    // Sequential Search Algorithm
    public static int sequentialSearch(int[] array, int target)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == target)
            {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    // Binary Search Algorithm (Assumes the array is sorted)
    public static int binarySearch(int[] array, int target) 
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (array[mid] == target)
            {
                return mid; // Return the index if the target is found
            }
            else if (array[mid] < target)
            {
                low = mid + 1;
            } 
            else
            {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be searched
        System.out.print("Enter the element to be searched: ");
        int target = scanner.nextInt();

        // Perform Sequential Search
        int sequentialResult = sequentialSearch(array, target);
        if (sequentialResult != -1) {
            System.out.println("Sequential Search: Element found at index " + sequentialResult);
        } else {
            System.out.println("Sequential Search: Element not found in the array");
        }

        // Perform Binary Search (Array must be sorted)
        // Sorting the array for binary search
        java.util.Arrays.sort(array);
        int binaryResult = binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found in the array");
        }
    }
}

