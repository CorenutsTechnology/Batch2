package com.feuji30nov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayToCollection 
{
	public <T>void convertion(T[] array)
	{
		List list=new ArrayList<>();
		for (int index = 0; index < array.length; index++) 
		{
			list.add(array[index]);
			
		}
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) { 
			System.out.println(iterator.next()); 
			}
		
			
	}

}
