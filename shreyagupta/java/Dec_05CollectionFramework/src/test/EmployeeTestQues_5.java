package com.crnuts.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.crnuts.classes.Employee;
import com.crnuts.classes.Ques_5;

public class EmployeeTestQues_5 {

	public static void main(String[] args) {

		System.out.println("***** QUES 5 *****");
		System.out.println("");

		Ques_5 ques_5 = new Ques_5();

		Map<Integer, Employee> hashMap = new HashMap<>();

		hashMap.put(1, new Employee(344, "Shreya", 54635.55));
		hashMap.put(5, new Employee(364, "Manish", 85654.45));
		hashMap.put(3, new Employee(767, "Yash", 55654.75));
		hashMap.put(7, new Employee(364, "Isha", 45654.45));
		hashMap.put(9, new Employee(767, "Youg", 35654.75));
		hashMap.put(3, new Employee(761, "Priya", 55654.75));


		ques_5.mapForEach(hashMap);
		

		Map<Integer, Employee> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put(1, new Employee(344, "Shreya", 54635.55));
		linkedHashMap.put(5, new Employee(364, "Manish", 85654.45));
		linkedHashMap.put(3, new Employee(767, "Yash", 55654.75));
		linkedHashMap.put(7, new Employee(364, "Isha", 45654.45));
		linkedHashMap.put(8, new Employee(767, "Youg", 35654.75));
		linkedHashMap.put(3, new Employee(761, "Priya", 55654.75));


		
		ques_5.mapForEach(linkedHashMap);
		
	}

}
