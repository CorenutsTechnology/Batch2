package com.crnuts.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import com.crnuts.classes.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(new Employee(1,"Manish",22,"Male",456789));
		empList.add(new Employee(2,"Shreya",21,"Female",789456));
		empList.add(new Employee(3,"Tara",21,"Female",678458));
		empList.add(new Employee(4,"Jeetu",22,"Male",876456));
		empList.add(new Employee(5,"Shejal",22,"Female",987654));
		
		Map<String,List<Employee>> map=new HashMap<>();
		List<Employee> temp= null;
		
		for(Employee e: empList) {
			if(map.containsKey(e.getGender())) {
				temp= map.get(e.getGender());
				temp.add(e);
				map.put(e.getGender(), temp);
			}
			else {
				temp=new ArrayList<>();
				temp.add(e);
				map.put(e.getGender(), temp);
			}
		}
		
		for(String e:map.keySet()) 
		System.out.println(e+" "+map.get(e));
		
		

		
		
	}

}
