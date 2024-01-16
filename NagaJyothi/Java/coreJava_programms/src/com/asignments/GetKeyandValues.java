package com.asignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.feuji11dec.MainTest;

public class GetKeyandValues 
{
	public void getvalues(Map<Integer, Student> map)
	{
		map.put(1, new Student(101,"Jyothi",24,"Cse"));
		map.put(2, new Student(102,"Indu",23,"Cse"));
		map.put(3, new Student(103,"Puri",22,"Cse"));
		map.put(4, new Student(104,"raji",23,"Ece"));
        System.out.println(map.entrySet());
		for(Entry<Integer, Student> result:map.entrySet())
		{
			System.out.println(result);
		}
		

	}
	public static void main(String[] args) 
	{
		GetKeyandValues values=new GetKeyandValues();
		Map<Integer, Student> map=new HashMap<>();
		values.getvalues(map);
		
	}

}
