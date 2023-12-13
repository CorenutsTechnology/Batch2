package com.feuji5dec;

import java.util.HashMap;
import java.util.Map;

import com.feuji4dec.Student;

public class GetValues 
{
	//get the values with out using keys.
	public void getValues(Map<String, Student> map)
	{
		map.put("one", new Student(20,"Jyothi"));
		map.put("two", new Student(21,"indu"));
		map.put("three", new Student(22,"puri"));
		map.put("four", new Student(23,"richitha"));
		map.put("four", null);
		map.put(null,new Student(23,"richitha"));
		System.out.println(map.values());
		
	}
	public static void main(String[] args)
	{
		GetValues value=new GetValues();
		Map<String, Student> map=new HashMap<>();
		value.getValues(map);
		
	}

}
