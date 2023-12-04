package com.crnuts.classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNonGeneric {

	public static void main(String[] args) {

		System.out.println("Adding numver values from non-generic ArrayList class: ");

		List li = new ArrayList();
		li.add(4);
		li.add("dds");
		li.add(61.7);
		li.add('s');
		li.add(2);
		li.add(6.6);

		double sum = 0;
		for (Object list : li) {
			if (list instanceof Number) {
				sum = sum + ((Number) (list)).doubleValue();
			}
		}
		System.out.println(sum);

	}

}
