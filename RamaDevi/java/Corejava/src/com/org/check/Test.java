package com.org.check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String args[]) {
//		Set<Student> studentSet = new HashSet<>();
//		studentSet.add(new Student(1,"Corenut","X"));
//		studentSet.add(new Student(1,"Corenuts","IX"));
//		System.out.println(studentSet);
		//RunTime exception
//		 Map<Integer, Object> sampleMap = new TreeMap<Integer,
//				 Object>();
//				  sampleMap.put(null, 3);
//				  sampleMap.put(null, 4);
//				  sampleMap.put(null, 4);
//				  System.out.println(sampleMap);
		
		//Array List
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		//Runtime Error
//		//list.set(4, 22);
//		System.out.print(list);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//list.addFirst(6);
		System.out.print(list);
}
}
