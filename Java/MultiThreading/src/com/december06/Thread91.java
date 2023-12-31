package com.december06;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Thread91 implements Runnable{
	Map<Integer,Integer> map = null;
	public Thread91(Map<Integer,Integer> map) {
		this.map=map;
	}
	@Override
	public void run() 
	
	{
		System.out.println("inserting elements");
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			map.put(i,i+1);
		}
	}
}
