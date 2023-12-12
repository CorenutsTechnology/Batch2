package com.crnuts.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.crnuts.classes.Employee;

public class EmployeeSalList_Ques4 {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "Manish", 22, "Male", 4000));
		emp.add(new Employee(2, "Shreya", 21, "Female", 78940));
		emp.add(new Employee(3, "Tara", 21, "Female", 6784));
		emp.add(new Employee(4, "Jeetu", 22, "Male", 17645));
		emp.add(new Employee(5, "Shejal", 22, "Female", 9874));

		List<Employee> empSalList = emp.stream().filter(s -> s.getSalary() > 10000).collect(Collectors.toList());

		System.out.println("Employee details whose salary is > 10000: \n");
		empSalList.stream().forEach(e -> System.out.println(e));
	}

}
