package com.feuji30nov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListToArray
{
	public <T>void convert(List list)
	{
		//List arrayList=new ArrayList<>();
		//Iterator<T> iterator=arrayList.iterator();
		int[] array=new int[list.size()];
		for(int index=0;index<list.size();index++)
		{
			System.out.println(list.get(index)); 
			array[index]=(int) list.get(index);
		}
		System.out.println("Array Elements");
		for(int index=0;index<=array.length-1;index++)
		{
			System.out.println(array[index]);
		}
	}

}
