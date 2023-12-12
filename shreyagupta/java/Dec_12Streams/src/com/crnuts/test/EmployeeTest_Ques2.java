package com.crnuts.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.crnuts.classes.Employee;

public class EmployeeTest_Ques2 {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "Manish", 22, "Male", 456789));
		emp.add(new Employee(2, "Shreya", 21, "Female", 789456));
		emp.add(new Employee(3, "Tara", 21, "Female", 678458));
		emp.add(new Employee(4, "Jeetu", 22, "Male", 876456));
		emp.add(new Employee(5, "Shejal", 22, "Female", 987654));
		
		
		System.out.println("Employee Details: \n");
		emp.stream().forEach(e-> System.out.println(e));
		
		
	}

}
