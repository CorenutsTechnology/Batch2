package com.crnuts.classes;

import java.util.Map;

public class Ques_3 {

	public void mapForEach(Map<Integer, Employee> emp) {
		System.out.println("\nIterating over Map.entrySet() using For-Each loop");

		System.out.println("keys" + "\t" + "values");
		for (Map.Entry<Integer, Employee> entry : emp.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}
