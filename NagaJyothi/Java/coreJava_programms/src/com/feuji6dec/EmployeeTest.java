package com.feuji6dec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.feuji4dec.ArrayList;
import com.feuji5dec.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list = new java.util.ArrayList<>();
		list.add(new Employee(1, "Jyothi", 25000, "JavaDeveloper"));
		list.add(new Employee(2, "puri", 30000, "PythonDeveloper"));
		list.add(new Employee(3, "indu", 35000, "ASE"));
		list.add(new Employee(4, "richi", 20000, "ASE"));
		int dCount = 0;
		int aCount = 0;
		
		Map<String, List<Employee>> map=new HashMap<>();
		for(Employee emp:list)
		{
			
		}
//		for (Employee e : list) {
//			if (e.getDesignation().contains("ASE")) {
//				// aCount++;
//
//			} else if (e.getDesignation().contains("JavaDeveloper")) {
//				dCount++;
//			}
//		}
//		System.out.println("Acount:" + aCount);
//		System.out.println("count:" + dCount);
		
		

	}

}
