package com.crnts.List.Assignment;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
//		ArrayList<String>array =new ArrayList();
//		array.add("rakhi");
//		array.add("sweta");
//		array.add("joe");
//		array.add(0, "hh");
//		array.add(10, "ii"); //IndexOutOfBoundsException
//		array.set(10, "ii"); //IndexOutOfBoundsException
//		System.out.println(array);
		
		List list =new List();
		list.nonGenneric();
		
	}
	
	public void nonGenneric()
	{
		ArrayList array =new ArrayList();
		array.add(1);
		array.add("corenuts");
		array.add(2);
		array.add('k');
		array.add(7);
		array.add(3);
		 int sum=0;
		for(Object elements:array)
		{ 
			if(elements instanceof Number )
			{   
//				sum=Integer.sum(sum, (int) elements);
				sum+=((Number) (elements)).intValue();
			}
		}System.out.println(sum);
//		for(int index =0;index<)
		
	}

}
