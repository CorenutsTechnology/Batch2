package com.asignments;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DiffWaysOfIterationsOnHashMap 
{
	public void displayResult(Map<Integer, Student> map)
	{
		map.put(1, new Student(101,"Jyothi",24,"Cse"));
		map.put(2, new Student(102,"Indu",23,"Cse"));
		map.put(3, new Student(103,"Puri",22,"Cse"));
		map.put(4, new Student(104,"Raji",23,"Ece"));
	    map.put(5, new Student(105,"Swathi",23,"cse"));
		map.put(null, null);
		map.put(null, null);
		map.put(6, null);
		map.put(7, null);

		

		
		Iterator<Entry<Integer, Student>>iterator=map.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		for(Map.Entry<Integer, Student> entry:map.entrySet())
		{
			System.out.println(entry);
		}
        Iterator iterator1=map.entrySet().iterator();
        while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
       

	}
   public static void main(String[] args)
   {
	   DiffWaysOfIterationsOnHashMap iteration=new DiffWaysOfIterationsOnHashMap();
	   HashMap<Integer, Student> map=new HashMap<>();
	   iteration.displayResult(map);
	   System.out.println("-------------");
	   LinkedHashMap<Integer, Student> map1=new LinkedHashMap<>();
	   iteration.displayResult(map1);
	   System.out.println("+++++++++++++");
	   /*hash table does not allow null key and null values
	    * if we try to insert null values u will get null pointer exception
	    */
	   Hashtable<Integer, Student> table=new Hashtable<>();
	   iteration.displayResult(table);
	   
   }
}
