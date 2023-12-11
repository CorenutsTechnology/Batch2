//Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
package com.crnts.FunctionalInterfaceAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortObjects {

	public static void main(String[] args) {
		SortObjects sortObjects=new SortObjects();
		sortObjects.sortByName();
	}
	
	void sortByName() {
		List<User> list = new ArrayList<>();
		list.add(new User(1, "rakhi", 2002));
		list.add(new User(12, "neha", 2018));
		list.add(new User(3, "Tom", 2008));
		list.add(new User(14, "abhi", 2006));
		Comparator c1 = (o1, o2) -> {
			return ((User) o1).getName().compareToIgnoreCase(((User) o2).getName());
		};

		Collections.sort(list, c1);
		System.out.println(list);

	}

}
