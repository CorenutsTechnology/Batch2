package com.december06;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Thread3 implements Runnable
{
	Map<Integer,Integer> map = null;
	public Thread3(Map<Integer,Integer> map) {
		this.map=map;
	}
	@Override
	public void run() 
	
	{
		System.out.println("printing elements");
		System.out.println(Thread.currentThread().getName());
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entry.iterator();			
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
}
}
