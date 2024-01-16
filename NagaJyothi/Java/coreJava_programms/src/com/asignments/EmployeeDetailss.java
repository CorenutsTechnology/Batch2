package com.asignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetailss 
{
	public static void main(String[] args) {
		List<EmployeeClass> employeeList = new ArrayList<>();
		 
		employeeList.add(new EmployeeClass(1, "Ram", 32, "Male", "HR", 2011, 25000.0));
		employeeList.add(new EmployeeClass(2, "Sita", 25, "Female", "Marketing", 2015, 13500.0));
		employeeList.add(new EmployeeClass(3, "Murali", 29, "Male", "Sales", 2012, 18000.0));
		employeeList.add(new EmployeeClass(4, "Mahesh", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new EmployeeClass(5, "Preethi", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new EmployeeClass(6, "Gopi", 43, "Male", "Accounts", 2016, 10500.0));
		employeeList.add(new EmployeeClass(7, "Kamal", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new EmployeeClass(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new EmployeeClass(9, "AKhila", 24, "Female", "Marketing", 2016, 11500.0));
		employeeList.add(new EmployeeClass(10, "Arjun", 38, "Male", "Sales", 2015, 11000.5));
		//male and femaile employee in organization.
		
		
	}

}
