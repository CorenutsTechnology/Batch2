package com.collections.nov30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator
{
	public String sortCmp()
	{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, 25000.0, "SE"));
		employees.add(new Employee(2, 35000.0, "Tester"));
		employees.add(new Employee(3, 45000.0, "Designing"));
		employees.add(new Employee(4, 15000.0, "SE"));
		employees.add(new Employee(5, 23000.0, "SD"));
		employees.add(new Employee(6, 32000.0, "Teste"));
		employees.add(new Employee(7, 17000.0, "OP"));
		System.out.println("sorting using comparator:");
		Comparator<Employee> cmp = new Comparator<>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}	
		};
		Collections.sort(employees ,cmp);
		System.out.println("sorting based on salary using comparator: ");
		employees.stream().forEach(System.out::println);
		
		Comparator<Employee> cmp2 = new Comparator<>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDesgn().compareTo(o2.getDesgn());
			}	
		};
		Collections.sort(employees ,cmp2);
		System.out.println("sorting based on designation using comparator: ");
		employees.stream().forEach(System.out::println);
		return "success";
	}
	public static void main(String[] args) 
	{
		SortUsingComparator comparator = new SortUsingComparator();
		comparator.sortCmp();
		
	}
}
