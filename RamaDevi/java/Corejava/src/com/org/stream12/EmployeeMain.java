package com.org.stream12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "hari"));
		emplist.add(new Employee(2, "dhama"));
		emplist.add(new Employee(3, "bhanu"));
		emplist.add(new Employee(4, "giri"));
		emplist.add(new Employee(5, "vimla"));
		Map<Integer, String> emp = emplist.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		emp.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey() + e.getValue());

		});

	}

}
