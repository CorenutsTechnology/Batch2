package com.december06;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Thread2 implements Runnable {
	Map<Integer,Integer> map = null;
	public Thread2(Map<Integer,Integer> map) {
		this.map=map;
	}
	@Override
	public void run() 
	
	{
		System.out.println("removing elements");
		System.out.println(Thread.currentThread().getName());
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entry.iterator();			
		while(iterator.hasNext())
		{
			iterator.remove();
		}
}
}
