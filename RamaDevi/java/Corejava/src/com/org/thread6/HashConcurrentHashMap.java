package com.org.thread6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashConcurrentHashMap {

	public static void main(String[] args) {
//		Map <Integer,String> empMap=new HashMap();
//		empMap.put(null, null);
//		empMap.put(1,new String("hari"));
//		empMap.put(2,new String("dhana"));
//		empMap.put(3,new String("bhanu"));
//		empMap.put(1,new String("hari"));
//		//only one null accepted
//		empMap.put(null, null);
//		
//		Iterator<Map.Entry<Integer,String>>ent=empMap.entrySet().iterator();
//		while(ent.hasNext())
//		{
//		Map.Entry<Integer, String> en=ent.next();
//		System.out.println(en);
//		}
		
		//Concurrent HashMap
		Map<Integer,String> empMap=new ConcurrentHashMap<>();
		//null values not accepted for keys ana values,throw nullpointer exception in runtime
		//empMap.put(null, null);
		empMap.put(1,new String("hari"));
		empMap.put(2,new String("dhana"));
		empMap.put(3,new String("bhanu"));
		empMap.put(1,new String("hari"));
		
		Iterator<Map.Entry<Integer,String>>ent=empMap.entrySet().iterator();
		while(ent.hasNext())
		{
		Map.Entry<Integer, String> en=ent.next();
		System.out.println(en);
		}
		
	}

}
