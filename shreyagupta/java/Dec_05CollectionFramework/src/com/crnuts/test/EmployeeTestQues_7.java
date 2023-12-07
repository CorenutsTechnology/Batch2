package com.crnuts.test;

import java.util.HashMap;
import java.util.Map;

import com.crnuts.classes.Employee;
import com.crnuts.classes.Ques_7;

public class EmployeeTestQues_7 {

	public static void main(String[] args) {

		Map<Employee, Character> map = new HashMap<>();

		map.put(new Employee(5, "Shreya", 52625, "Gaya"), 'a');

		map.put(new Employee(6, "Yash", 65625, "Kolkata"), 'b');

		map.put(new Employee(3, "Manish", 67625, "Ranchi"), 'c');

		map.put(new Employee(7, "Jeetu", 55625, "Ranchi"), 'd');

		map.put(new Employee(2, "Yash", 77625, "Patna"), 'e');

		Ques_7 ques_7 = new Ques_7();
		ques_7.usingKeySet(map);

	}

}
