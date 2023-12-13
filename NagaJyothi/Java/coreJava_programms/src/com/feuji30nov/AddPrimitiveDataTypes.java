package com.feuji30nov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddPrimitiveDataTypes 
{
	//add primitive data types to collections and print them using for and iterator.
	public<T> void dataTypes(List list)
	{
		Iterator iterator=list.iterator();
		System.out.println("Display elements by using iterator");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("Display elemnts by using for loop ");
		for(int index=0;index<=list.size()-1;index++)
		{
			System.out.println(list.get(index));
		}
	}
	public static void main(String[] args) 
	{
		AddPrimitiveDataTypes result=new AddPrimitiveDataTypes();
		List <Integer>list=new ArrayList<>();
		list.add(10);
		list.add(23);
		list.add(12);
		list.add(67);
		result.<String>dataTypes(list);
		
		
	}
   
}
