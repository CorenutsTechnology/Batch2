package com.asignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PrimitiveElementsInHashSet
{
	public void displayElements(Set set)
	{
		
		set.add("Jyothi");
		set.add("puri");
		set.add("indu");
		set.add("Akshu");
		set.add("puri");
		set.add("indu");
		
//		for(Object result:set)
//		{
//			System.out.println(result);
//		}
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
	}
   public static void main(String[] args) {
	   PrimitiveElementsInHashSet result=new PrimitiveElementsInHashSet();
	   Set set=new TreeSet<>();
	   result.displayElements(set);
}
}
