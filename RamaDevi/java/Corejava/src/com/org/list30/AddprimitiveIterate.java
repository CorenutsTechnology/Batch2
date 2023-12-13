package com.org.list30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddprimitiveIterate {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// Adding elements into list
		list.add(10);
		list.add(16);
		list.add(23);
		list.add(40);
		// using for loop
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		// iterating the elements using iterator
		Iterator<Integer> iterate = list.iterator();
		while (iterate.hasNext()) {
			Integer value = iterate.next();
			System.out.println(value);
		}
	}

}
