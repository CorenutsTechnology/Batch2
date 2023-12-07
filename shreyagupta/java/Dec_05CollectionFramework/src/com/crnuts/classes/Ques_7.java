package com.crnuts.classes;

import java.util.Map;

public class Ques_7 {

	public void usingKeySet(Map<Employee, Character> emp) {
		System.out.println("Iterating over keys and values using keySet()");
		System.out.println("                            keys" +
		"\t                      " + "values");

		for (Employee keys : emp.keySet()) {
			System.out.println(keys + " \t" + emp.get(keys));
		}
	}

}
