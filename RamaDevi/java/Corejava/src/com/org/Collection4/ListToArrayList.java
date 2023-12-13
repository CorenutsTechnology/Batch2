package com.org.Collection4;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();

		// Add elements to the ArrayList
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.println("Original ArrayList: " + arrayList);

		// Get a sublist from the ArrayList
		int startIndex = 1;
		int endIndex = 4;
		List<Integer> subList = arrayList.subList(0, 4);

		System.out.println("Sublist: " + subList);
	}

}
