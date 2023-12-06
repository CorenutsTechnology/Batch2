package com.crnuts.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import com.crnuts.classes.Employee;
import com.crnuts.classes.Ques_1;
import com.crnuts.classes.Ques_2;
import com.crnuts.classes.Ques_3;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("***** QUES 1 *****");

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(344, "Shreya", 54635.55));
		map.put(3, new Employee(364, "Manish", 85654.45));
		map.put(5, new Employee(767, "Yash", 55654.75));

		Ques_1 iterations = new Ques_1();

		iterations.usingKeySet(map);

		iterations.mapForEach(map);

		iterations.usingIterator(map);

		System.out.println("***** QUES 2 *****");

		Ques_2 ques_2 = new Ques_2();
		HashMap<Integer, Employee> hashMap = new HashMap<>();

		hashMap.put(1, new Employee(344, "Shreya", 54635.55));
		hashMap.put(3, new Employee(364, "Manish", 85654.45));
		hashMap.put(5, new Employee(767, "Yash", 55654.75));

		ques_2.itrateUsingValues(hashMap);

		System.out.println("***** QUES 3 *****");
		Ques_3 ques_3 = new Ques_3();
		ques_3.mapForEach(map);

		
		System.out.println("***** QUES 4 *****");
		LinkedHashMap<Integer, Employee> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(1, new Employee(344, "Shreya", 54635.55));
		linkedHashMap.put(3, new Employee(364, "Manish", 85654.45));
		linkedHashMap.put(5, new Employee(767, "Yash", 55654.75));
		
		

	}

}
