//Find the sum of all elements in the list. For example, if the input is 1,2,3,4,5, the output should be 15?
package com.crnts.streams;

import java.util.ArrayList;

public class SumOfElements {
	public static void main(String[] args) {
		SumOfElements sumOfElements=new SumOfElements();
		sumOfElements.displaySum();
	}

	public void displaySum() {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);

		System.out.println(numList.stream().reduce(0, (a, b) -> a + b));
	}
}
