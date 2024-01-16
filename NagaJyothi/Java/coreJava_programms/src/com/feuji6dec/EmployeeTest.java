package com.feuji6dec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.feuji5dec.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Jyothi", 25000, "JavaDeveloper"));
		list.add(new Employee(2, "puri", 30000, "PythonDeveloper"));
		list.add(new Employee(3, "indu", 35000, "ASE"));
		list.add(new Employee(4, "richi", 20000, "ASE"));
		int dCount = 0;
		int aCount = 0;
		
		Map<String, List<Employee>> map=new HashMap<>();
		List<Employee> alist=null;
		for(Employee emp:list)
		{
			//alist=new ArrayList<>();
			if(map.containsKey(emp.getDesignation()))
			{
				alist=map.get(emp.getDesignation());
				alist.add(emp);
				map.put(emp.getDesignation(), alist);
			}
			else
			{
				alist=new ArrayList<>();
				alist.add(emp);
				map.put(emp.getDesignation(), alist);
			}
		}
		for(Entry<String, List<Employee>> entry:map.entrySet())
		{
			System.out.println("Key"+entry.getKey()+" value:"+entry.getValue());
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
