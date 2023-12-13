package com.org.check;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> empset=new HashSet();
		empset.add(new Employee("rama","hyd"));
		empset.add(new Employee("raj","bang"));
		empset.add(new Employee("rama","hyd"));
		for(Employee emp:empset)
		{
			System.out.println(emp);
		}
	}

}
