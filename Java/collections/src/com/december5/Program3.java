//3. Write a program to get key and values at a time from HasMap.
package com.december5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Program3
{
	public void method()
	{
		Map<Integer ,Student> map = new HashMap<>();
		map.put(1,new Student(1,"jany",23));
		map.put(2,new Student(2,"somu",24));
		map.put(3,new Student(3,"ram",25));
		map.put(4,new Student(4,"karam",23));
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		Iterator<Entry<Integer,Student>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext())
		{		
			System.out.println(iterator2.next());
			
		}
		
		
	}
}
