//1. Write a program to show the behavior of HashMap using different ways of iterations?
package com.december5;
import java.util.*;
import java.util.Map.Entry;
public class Program1 
{
	public void method()
	{
		Map<Integer ,Student> map = new HashMap<>();
		map.put(1,new Student(1,"jany",23));
		map.put(2,new Student(2,"somu",24));
		map.put(3,new Student(3,"ram",25));
		map.put(4,new Student(4,"karam",23));
		
		//=-first way
		Set<Integer> set= map.keySet();
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Integer key = iterator.next();
			System.out.println(key+" -- "+map.get(key));
		}
		
		//second way
		System.out.println("second way");
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		Iterator<Entry<Integer,Student>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext())
		{
			
			System.out.println(iterator2.next());
		}		
	}
}
