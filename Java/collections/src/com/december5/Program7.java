package com.december5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Program7 {
	public void method()
	{
		Map<Employee2,String> map = new HashMap<>();
		map.put(new Employee2(123,"sree","Hyd"),"SE");
		map.put(new Employee2(124,"raju","Bnglr"),"SD");
		map.put(new Employee2(125,"jony","Odisha"),"Tester");
		map.put(new Employee2(126,"ram","TL")," ssSE");
		map.put(new Employee2(126,"ram","AP"),"tSE");//doubt ,it is giving 4 values if we sort using
					// name ,but 5 values if we sort using location
		
		
		Map<Employee2,String> map2 = new TreeMap(map);
		
		Set<Employee2> set= map2.keySet();
		Iterator<Employee2> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Employee2 key = iterator.next();
			System.out.println(key+" -- "+map2.get(key));
		}
		
		
//int i =	map.entrySet().stream().map((e)->e.getKey().getEmpNo()).sorted(Comparator.reverseOrder()).toList().get(0);
//	System.out.println(i);
	}
	public static void main(String[] args) {
		new Program7().method();
	}
}
