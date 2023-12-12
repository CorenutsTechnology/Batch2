//Create a new list of employees.Find whose salary is greater than 10000 from the list of employee records?
package com.crnts.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest employeeTest =new EmployeeTest();
		employeeTest.display();
	}
	public void display()
	{
		//stream() is not supporting Maps
//		Map<Integer, Employee> details=new HashMap<>();
//		details.put(1, new Employee("Developer","Tom"));
//		details.put(1, new Employee("Tester","jack"));
		
		List<Employee> details=new ArrayList<>();
		details.add(new Employee("Developer","Tom",7877.7));
		details.add(new Employee("Tester","Jack",78708.8));
		details.add(new Employee("Tester","adi",700.0));
		 List<Employee> result = details.stream().filter((e)->e.getSalary()<10000).collect(Collectors.toList());	
		
		 for(Employee list:result)
		 {
			 System.out.println(list);
		 }
		
	}

}
