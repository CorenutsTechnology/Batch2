package com.org.map5;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortKeys {

	public static void main(String[] args) {
		Map<Employee,Integer> map=new TreeMap();
		map.put(new Employee("giri","hyd"),6);
		map.put(new Employee("siri","kurnool"),7);
		map.put(new Employee("varshi","chennai"),3);
		map.put(new Employee("pavi","bang"),9);
		map.put(new Employee("prashu","matam"),4);
		map.put(new Employee("pavi","bang"),9);
		for(Map.Entry<Employee, Integer> e:map.entrySet())
		{
		System.out.println(e.getKey()+","+e.getValue());	
		}
		
		
	}
}
