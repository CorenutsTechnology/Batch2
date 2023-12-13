package com.org.thread6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "pavan", 22, "Male", 456789));
		empList.add(new Employee(2, "SivaKumari", 21, "Female", 789456));
		empList.add(new Employee(3, "Tara", 21, "Female", 678458));
		empList.add(new Employee(4, "Uma", 22, "Male", 876456));
		empList.add(new Employee(5, "Swathi", 22, "Female", 987654));

		Map<String, List<Employee>> map = new HashMap<>();
		List<Employee> temp = new ArrayList<>();
		for (Employee e : empList) {
			if (map.containsKey(e.getGender())) {
				temp = map.get(e.getGender());
				temp.add(e);
				map.put(e.getGender(), temp);
			} else {
				temp = new ArrayList<>();
				temp.add(e);
				map.put(e.getGender(), temp);
			}

		}
		// map.put(e.getGender(), temp);

		System.out.println(map);

		for (Entry<String, List<Employee>> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue().size());
		}

		Map<String, Integer> mapCount = new HashMap<>();
		int count = 0;
		for (Employee e : empList) {
			if (map.containsKey(e.getGender())) {
				count = mapCount.get(e.getGender());
				count++;
				mapCount.put(e.getGender(), count);
			} else {

				mapCount.put(e.getGender(), 1);
			}

		}

		for (Entry<String, Integer> e : mapCount.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}

		// Map<String, List<Employee>>
		List<Employee> maleList = new ArrayList<>();
		List<Employee> femaleList = new ArrayList<>();
		int fCount = 0;
		for (Employee e : empList) {
			if (e.getGender().equals("Male")) {
				maleList.add(e);
			}
			if (e.getGender().equals("Female")) {
				femaleList.add(e);
			}
		}
		System.out.print("Male:" + maleList);
		System.out.print("Female:" + femaleList.size());

	}
}
