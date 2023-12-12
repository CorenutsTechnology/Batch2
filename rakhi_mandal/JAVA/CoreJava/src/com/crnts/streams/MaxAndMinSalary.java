//Find the maximum and minimum salary from the employee list using streams?
package com.crnts.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinSalary {

	public static void main(String[] args) {
		List<Employee> details=new ArrayList<>();
		details.add(new Employee("Developer","Tom",7877.7));
		details.add(new Employee("Tester","Jack",78708.8));
		details.add(new Employee("Tester","abhi",700.0));
		details.add(new Employee("Developer","jerry",78707.7));
		details.add(new Employee("deve","Jack",7998.8));
		details.add(new Employee("Tester","adi",71.0));
		 List<Employee> result = details.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());	
		 System.out.println("Sorted according to Salary :");
		 for( Employee print:result)
		       {
		    	   System.out.println(print);
		       }
		 System.out.println("----------------------------------------------");
		 System.out.println("Employee with min salary : "+result.get(0));
		 System.out.println("Employee with max salary : "+result.get(result.size()-1));
	}

}
