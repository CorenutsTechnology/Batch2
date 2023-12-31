//4. Write a program to use Employee object as a key in the HashMap.
package com.december5;
import java.util.*;
public class Program4
{
	public void method()
	{
		Map<Employee,String> map = new HashMap<>();
		map.put(new Employee(123,"sree",50000.00),"SE");
		map.put(new Employee(124,"raju",60000.00),"SD");
		map.put(new Employee(125,"jony",55000.00),"Tester");
		map.put(new Employee(126,"ram",45000.00),"SE");
		map.put(new Employee(126,"ram",45000.00),"SE");
		
		//if we don't override hashcode method in employee class , it will allow duplicates
		Set<Employee> set= map.keySet();
//		Collection<String> set2=map.values();
		Iterator<Employee> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Employee key = iterator.next();
			System.out.println(key+" -- "+map.get(key));
		}
		
	}
}
