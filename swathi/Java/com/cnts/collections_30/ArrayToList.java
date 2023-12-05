package com.cnts.collections_30;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
	
	
	public void arrayToArrayList(Employee[] employees) {
		List<Employee> employeeList = new ArrayList<>();
		
		for (Employee employee : employees) {
			employeeList.add(employee);
		}
		System.out.println(employeeList);
		
//		for (Employee employee : employeeList) {
//            System.out.println(employee);
//        }
		
		
//		
	
	}
	
	
	

}
