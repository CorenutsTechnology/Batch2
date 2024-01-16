package com.asignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimitiveDataTypesToList 
{
	public void display(List list)
	{
		list.add(23);
		list.add("Jyothi");
		list.add("Puri");
		list.add("indu");
		list.add(23.77);
		list.add('J');
		
		for(int index=0;index<=list.size()-1;index++)
		{
			System.out.println(list.get(index));
		}
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		List list=new ArrayList<>();
		PrimitiveDataTypesToList result=new PrimitiveDataTypesToList();
		result.display(list);
		
	}

}
