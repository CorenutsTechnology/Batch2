package com.crnuts.test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.crnuts.classes.Employee;

public class EmployeeTestQues_4 {

	public static void main(String[] args) {

		System.out.println("***** QUES 4 *****");

		HashMap<Employee, Integer> hashMap = new HashMap<>();

		hashMap.put(new Employee(344, "Shreya", 54635.55), 1);
		hashMap.put(new Employee(364, "Manish", 85654.45), 2);
		hashMap.put(new Employee(767, "Yash", 55654.75), 3);

		System.out.println(hashMap.keySet());

	}

}
