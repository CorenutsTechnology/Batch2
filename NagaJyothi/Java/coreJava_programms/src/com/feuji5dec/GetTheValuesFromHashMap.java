package com.feuji5dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.asignments.Student;

public class GetTheValuesFromHashMap 
{
	public void getTheValues(Map<Integer, Student> map)
	{
		map.put(1, new Student(101,"Jyothi",24,"Cse"));
		map.put(2, new Student(102,"Indu",23,"Cse"));
		map.put(3, new Student(103,"Puri",22,"Cse"));
		map.put(4, new Student(104,"raji",23,"Ece"));
        System.out.println(map.values());
		for(Entry<Integer, Student> result:map.entrySet())
		{
			System.out.println(result.getValue());
		}
		
	}
	public static void main(String[] args) 
	{
		GetTheValuesFromHashMap values=new GetTheValuesFromHashMap();
		Map<Integer, Student> map=new HashMap<>();
		
		values.getTheValues(map);
		
	}

}
