//9. Write a program to show the difference between HashMap and ConcurrentHashMap in multi
//threading environment.
package com.december06;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class Thread1 implements Runnable
{
	Map<Integer,Integer> map = null;
	public Thread1(Map<Integer,Integer> map) {
		this.map=map;
	}
	@Override
	public void run() 
	
	{
		System.out.println("inserting elements");
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			map.put(i,i);
		}
	}
}	
//		Set<Entry<Integer, Integer>> entry = map.entrySet();
//		Iterator<Entry<Integer, Integer>> iterator = entry.iterator();
//		while(iterator.hasNext())
//		{
////			System.out.println(iterator.next());
//			iterator.remove();
//		}
//		System.out.println(entry);
	

