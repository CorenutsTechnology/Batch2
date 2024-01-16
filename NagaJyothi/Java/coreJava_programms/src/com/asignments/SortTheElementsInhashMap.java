package com.asignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SortTheElementsInhashMap 
{
	public void sort(Map<Employee, Integer> map)
	{
		map.put(new Employee(101,"jyothi",30000.50), 1);
		map.put(new Employee(102,"indu",35000.50), 2);
		map.put(new Employee(103,"puri",40000.50), 3);
		for(Entry<Employee, Integer> entry:map.entrySet())
		{
			System.out.println(entry);
		}
	}
	public static void main(String[] args) 
	{
		SortTheElementsInhashMap result=new SortTheElementsInhashMap();
		Map<Employee, Integer> map=new HashMap<>();
		
		
		result.sort(map);
		
	}
	

}
