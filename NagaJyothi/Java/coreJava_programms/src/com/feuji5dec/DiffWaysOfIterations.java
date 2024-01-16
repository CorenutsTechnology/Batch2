package com.feuji5dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.feuji4dec.Student;

public class DiffWaysOfIterations 
{
	public void display(Map<Integer, Student>map)
	{
	  map.put(1, new Student(22,"Jyothi"));
	  map.put(2, new Student(23,"Indu"));
	  map.put(3, new Student(23,"Puri"));
	  map.put(4, new Student(22,"Richi"));
	 Iterator iterator= map.entrySet().iterator();
	 while(iterator.hasNext())
	 {
		 System.out.println(iterator.next());
	 }
	Iterator<Entry<Integer, Student>> iterator1=map.entrySet().iterator();
	while(iterator1.hasNext())
	{
		System.out.println(iterator1.next());
	}
	
	for(Map.Entry<Integer, Student> entry:map.entrySet())
	{
		System.out.println(entry);
	}
	}
   public static void main(String[] args) 
   {
	   DiffWaysOfIterations iterations=new DiffWaysOfIterations();
	   Map<Integer, Student> map=new HashMap<>();
	   iterations.display(map);
	
   }
}
