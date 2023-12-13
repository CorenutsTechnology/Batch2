package com.org.programs14;

import java.util.Arrays;

public class SortMain {

	public static void main(String[] args) {
		int[] array= {5,8,2,9,17};
		SortingAlgorithm sort =new SortingAlgorithm();
		sort.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		sort.selectionSort(array);
		System.out.println(Arrays.toString(array));
		sort.insertionSort(array);
		System.out.println(Arrays.toString(array));

	}

}
