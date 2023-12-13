package com.feuji4dec;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
	public static void main(String[] args) {
		List list = new java.util.ArrayList<>();
		list.add(10);
		list.add("Corenuts");
		list.add('k');
		list.add(20);
		list.add(5);
		ListIterator iterator = list.listIterator();
		Integer sum = 0;
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Integer) {
				System.out.println(o);
				sum = sum + (Integer) o;
			} else {
				iterator.next();
			}
		}
		int k = sum;
		System.out.println(k);
	}

}
