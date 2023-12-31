package com.collections.nov30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortusingComparable 
{
	public String sortMethod()
	{
		List<Employee> employees = new ArrayList<>();
	
		employees.add(new Employee(1, 25000.0, "Tester"));
		employees.add(new Employee(3, 45000.0, "Developer"));
		employees.add(new Employee(4, 15000.0, "SE"));
		employees.add(new Employee(2, 25000.0, "SE"));
		Collections.sort(employees);
		System.out.println("after sorting based on salary:");
		employees.stream().forEach(System.out::println);
		return "success";	
	}
	
	public static void main(String[] args) {
		SortusingComparable comparable = new SortusingComparable();
		comparable.sortMethod();
	}
}
