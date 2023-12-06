package com.crnuts.classes;

import java.util.Map;

public class Ques_5 {

	public void mapForEach(Map<Integer, Employee> emp) {
		System.out.println("\nIterating over Map.entrySet() using For-Each loop");

		System.out.println("keys" + "\t" + "values");
		for (Map.Entry<Integer, Employee> entry : emp.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

	public void usingKeySet(Map<Integer, Employee> emp) {
		System.out.println("Iterating over keys and values using keySet()");
		System.out.println("keys" + "\t" + "values");

		for (Integer keys : emp.keySet()) {
			System.out.println(keys + " \t" + emp.get(keys));
		}
	}

}
