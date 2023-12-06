package com.crnts.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashDifferences {

	public static void main(String[] args) {
		HashDifferences hash =new HashDifferences();
		hash.hasMap();
//		hash.linkedHasMap();
//		hash.hashTable();
	}
	
	public void hasMap()
	{//no duplicates on key //updates key with new value given
		HashMap<Integer, String> hash=new HashMap();
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		hash.put(20, "Daniel");
		hash.put(20, "rakhi");
		hash.put(null, "Jerry"); //accepts null as key 
		
		for(Map.Entry<Integer,String >entry:hash.entrySet())
		{
			Integer key=entry.getKey();
			String names=entry.getValue();
			System.out.println("Key : "+key+" Names : "+names);
		}
	}
	
	public void linkedHasMap()
	{   //no duplicates on key //updates key with new value given  //insertion order maintains
		LinkedHashMap<Integer, String> hash=new LinkedHashMap(); 
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		hash.put(2, "Tom");
		hash.put(5, "Jerry");
		hash.put(20, "Daniel");
		hash.put(2, "Tom");
		hash.put(20, "Jerry");
		hash.put(null, "Jerry");  //accepts null as key
		
		for(Integer key:hash.keySet())
		{
			String names=hash.get(key);
			
			System.out.println("Key : "+key+" Names : "+names);
		}
	}
	
	public void hashTable()
	{   //no duplicates on key //updates key with new value given
		Hashtable<Integer, String> hash=new Hashtable(); 
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		hash.put(2, "Tom");
		hash.put(5, "Jerry");
		hash.put(20, "Daniel");
		hash.put(2, "Tom");
		hash.put(20, "Jerry");
		hash.put(null, "Jerry");  //RTE
		
		for(Integer key:hash.keySet())
		{
			String names=hash.get(key);
			
			System.out.println("Key : "+key+" Names : "+names);
		}
	}

}
