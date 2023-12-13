package com.org.check;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		
	
//		Map<Integer, Object> sampleMap = new TreeMap<Integer,
//				Object>();
//				sampleMap.put(1, null);
//				sampleMap.put(4, null);
//				sampleMap.put(3, null);
//				sampleMap.put(2, null);
//				//sampleMap.put(null, null);
//				System.out.println(sampleMap);
		
//		Set s = new HashSet();
//		s.add(new Long(10));
//		s.add(new Integer(10));
//		for(Object object : s)
//		{
//		System.out.println("Test - "+object);
//		}
		
		LinkedList obj = new LinkedList();
		obj.addLast("D");
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.addFirst("D");
		System.out.println(obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj);
		}
}}
