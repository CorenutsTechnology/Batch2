package com.crnuts.classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ques_1 {

	public void usingKeySet(Map<Integer, Employee> emp) {
		System.out.println("Iterating over keys and values using keySet()");
		for (Integer keys : emp.keySet()) {
			System.out.println("keys : " + keys + " , values: " + emp.get(keys));
		}
	}

	public void mapForEach(Map<Integer, Employee> emp) {
		System.out.println("\nIterating over Map.entrySet() using For-Each loop");

		System.out.println("keys" + "\t" + "values");
		for (Map.Entry<Integer, Employee> entry : emp.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

	public void usingIterator(Map<Integer, Employee> emp) {
		System.out.println("\nIterating over Map<k , v> using iterator() method");

		System.out.println("keys" + "\t" + "values");
		Iterator<Map.Entry<Integer, Employee>> itr = emp.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Employee> entry = itr.next();
			System.out.println(entry.getKey() + " \t" + entry.getValue());
		}
	}

	
}
