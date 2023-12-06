//Write a program to show the behavior of HashMap using different ways of iterations?
package com.crnts.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Has_Map {

	public static void main(String[] args) {
		Has_Map map =new Has_Map();
		System.out.println("-------Using Iterator---------");
		map.iterator();
		System.out.println("-------Using For Each Loop---------");
		map.forEach();
		System.out.println("-------Using KeySet---------");
		map.keySet();
	}
	public void iterator()
	{
		HashMap<Integer, String> hash=new HashMap();
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		Iterator<Map.Entry<Integer,String >> show=hash.entrySet().iterator();
		while(show.hasNext())
		{
			Map.Entry<Integer,String> entry=show.next();
			Integer key=entry.getKey();
			String names=entry.getValue();
			System.out.println("Key : "+key+" Names : "+names);
		}
	}
	public void forEach()
	{
		HashMap<Integer, String> hash=new HashMap();
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		
		for(Map.Entry<Integer,String >entry:hash.entrySet())
		{
			Integer key=entry.getKey();
			String names=entry.getValue();
			System.out.println("Key : "+key+" Names : "+names);
		}
	}
	public void keySet()
	{
		HashMap<Integer, String> hash=new HashMap();
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		
		for(Integer key:hash.keySet())
		{
			String names=hash.get(key);
			
			System.out.println("Key : "+key+" Names : "+names);
		}
	}
	

}
