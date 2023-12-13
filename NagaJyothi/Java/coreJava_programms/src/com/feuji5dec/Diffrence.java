package com.feuji5dec;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.feuji4dec.Student;

public class Diffrence
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

   }
	public static void main(String[] args) 
	{
		Diffrence elements=new Diffrence();
		Map<Integer, Student> map=new HashMap<>();
		elements.display(map);
		Map<Integer, Student> map1=new Hashtable<>();
		elements.display(map1);
		Map<Integer, Student> map2= new LinkedHashMap<>();
		elements.display(map2);
		
		
		
	}
}
