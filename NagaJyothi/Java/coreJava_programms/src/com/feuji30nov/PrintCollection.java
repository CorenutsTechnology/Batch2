package com.feuji30nov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintCollection 
{
	public <T> void printElemnts(List list)
	{
		//List arrayList=new ArrayList<>();
		Iterator <Integer>iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
