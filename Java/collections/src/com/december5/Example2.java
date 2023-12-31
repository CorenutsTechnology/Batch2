package com.december5;

import java.util.*;

public class Example2 
{
	public void method() 
	{
		Map<Student, Student> map = new HashMap<>();
		map.put(new Student(1, "Madhura", 98), new Student(1, "Madhura", 98));
		map.put(new Student(2, "pravali", 96), new Student(2, "pravali", 96));
		map.put(new Student(3, "Mounika", 94), new Student(3, "Mounika", 94));
		map.put(new Student(4, "jyothi", 97), new Student(4, "jyothi", 97));
		map.put(new Student(5, "supriya", 99), new Student(5, "supriya", 99));

		Set<Student> keySet = map.keySet();
		System.out.println(keySet.size());
		Iterator<Student> iterator = keySet.iterator();
//		while (iterator.hasNext()) 
//		{
//			Student key = iterator.next();
//			Student value = map.get(key);
//			System.out.println("key is = " + key + " value is = " + value);
//		}
		find(map,"supriya",keySet);
	}
	public void find(Map<Student,Student> map , String name,Set<Student> keySet )
	{
		Student key=null;
		for(Student st:keySet)
		{
			if(st.getName().equalsIgnoreCase(name))
			{
				key=st;
				break;
			}
		}
		
		System.out.println("details of "+name+" is: "+map.get(key));
	
	}
}
