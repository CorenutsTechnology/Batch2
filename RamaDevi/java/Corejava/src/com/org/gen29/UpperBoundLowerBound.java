package com.org.gen29;

import java.util.ArrayList;

public class UpperBoundLowerBound {
	public <T extends Comparable<String>> void compare(T value1, T value2) {
		System.out.println(value1.equals(value2));
	}

	public void display(ArrayList<? super Integer> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
