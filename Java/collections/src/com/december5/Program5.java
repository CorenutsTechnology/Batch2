package com.december5;

import java.util.*;

public class Program5 
{
	public void method()
	{
		System.out.println("hashmap...........");
		Map<Employee,String> map = new HashMap<>();
		map.put(new Employee(123,"sree",50000.00),"SE");
		map.put(new Employee(124,"raju",60000.00),"SD");
		map.put(new Employee(125,"jony",55000.00),"Tester");
		map.put(new Employee(126,"ram",45000.00),"SE");
		map.put(new Employee(126,"ram",45000.00),"SE");
		map.put(null,"tester");
		
		//if we don't override hashcode method in employee class , it will allow duplicates
		Set<Employee> set= map.keySet();
		Iterator<Employee> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Employee key = iterator.next();
			System.out.println(key+" -- "+map.get(key));
		}		
	}
	
	public void method2()
	{
		System.out.println("hashTable.............");
		//hashtable do not take null value
		Map<Employee,String> map = new Hashtable<>();
		map.put(new Employee(123,"sree",50000.00),"SE");
		map.put(new Employee(124,"raju",60000.00),"SD");
		map.put(new Employee(125,"jony",55000.00),"Tester");
		map.put(new Employee(126,"ram",45000.00),"SE");
		map.put(new Employee(126,"ram",45000.00),"SE");
//		map.put(null,"tester");
		
		//if we don't override hashcode method in employee class , it will allow duplicates
		Set<Employee> set= map.keySet();
		Iterator<Employee> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Employee key = iterator.next();
			System.out.println(key+" -- "+map.get(key));
		}		
	}
	
	public void method3()
	{
		System.out.println("linked hashmap .........");
		//hashtable do not take null value
		Map<Employee,String> map = new LinkedHashMap<>();
		map.put(new Employee(123,"sree",50000.00),"SE");
		map.put(new Employee(124,"raju",60000.00),"SD");
		map.put(new Employee(125,"jony",55000.00),"Tester");
		map.put(new Employee(126,"ram",45000.00),"SE");
		map.put(new Employee(126,"ram",45000.00),"SE");
//		map.put(null,"tester");
		
		//if we don't override hashcode method in employee class , it will allow duplicates
		Set<Employee> set= map.keySet();
		Iterator<Employee> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Employee key = iterator.next();
			System.out.println(key+" -- "+map.get(key));
		}		
	}
}
