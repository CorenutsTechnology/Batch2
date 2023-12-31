
package com.december5;
import java.util.*;

public class Example1 
{
	
	public void method()
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"Madhura",98));
		list.add(new Student(2,"pravalika",98));
		list.add(new Student(3,"Supriya",98));
		list.add(new Student(4,"Jyothi",98));
		list.add(new Student(5,"Mounika",98));
		Map<String ,Student> map = new HashMap<>();
		String[] strArray = {"Madhura","pravalika","Supriya","jyothi","mounika"};
		for(int index=0;index<5;index++)
		{
			map.put(strArray[index], list.get(index));
		}
		
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext())
		{
			String key = iterator.next();
			System.out.println(key+" --- "+map.get(key));
			
		}
		find(map,"jyothi");
	}
	
	public void find(Map<String,Student> map , String key)
	{
		System.out.println(key+" details are : "+map.get(key));
	}
}
