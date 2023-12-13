package com.feuji5dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortEmployeeElemnts {
	// sort the employee elements using hashmap based on keys
	public void sort(Map<Employee, Integer> map) {
		map.put(new Employee(1, "Jyothi", 40000, "JavaDeveloper"), 0);
		map.put(new Employee(2, "Indu", 35000, "PythonDeveloper"), 1);
		map.put(new Employee(3, "Puri", 45000, "HR"), 2);
		map.put(new Employee(4, "Richita", 30000, "QA Anaylst"), 1);
		
       Iterator<Entry<Employee, Integer>> iterator=map.entrySet().iterator();
		/*
		 * Iterator<Employee>iterator=map.keySet().iterator(); List<Employee>list=new
		 * ArrayList<>(); System.out.println("List Elements"); while(iterator.hasNext())
		 * { list.add((Employee) iterator.next());
		 * 
		 * } Collections.sort(list); System.out.println(list);
		 */
       while(iterator.hasNext())
       {
    	   System.out.println(iterator.next());
       }
	}
	
	public static void main(String[] args)
	{
		ComparingNames names=new ComparingNames();
		SortEmployeeElemnts sort=new SortEmployeeElemnts();
		Map<Employee, Integer> map=new TreeMap<>(names);
		System.out.println();
		sort.sort(map);
		
	}

}
