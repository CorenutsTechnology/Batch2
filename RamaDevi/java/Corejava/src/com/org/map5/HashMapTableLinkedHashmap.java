package com.org.map5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTableLinkedHashmap {

	public static void main(String[] args) {
//		Map map=new HashMap();
//		map.put(new Employee("bhanu"),new String("29"));
//		map.put(new Employee("varun"),new String("35"));
//		map.put(new Employee("prakash"),new String("45"));
//		map.put(new Employee("nayani"),new String("28"));
//		map.put(new Employee("prakash"),new String("45"));
//		map.put(new Employee("prakash"),new String("30"));
		
//		Iterator iterate=map.entrySet().iterator();
//		while(iterate.hasNext()) {
//			System.out.println(iterate.next());
//		}
		
//		//using Linked HashMap
//		Map map=new LinkedHashMap();
//		map.put(new Employee("bhanu"),new String("29"));
//		map.put(new Employee("varun"),new String("35"));
//		map.put(new Employee("prakash"),new String("45"));
//		map.put(new Employee("nayani"),new String("28"));
//		map.put(new Employee("prakash"),new String("45"));
//		map.put(new Employee("prakash"),new String("30"));
//		
//		Iterator iterate=map.entrySet().iterator();
//		while(iterate.hasNext()) {
//			System.out.println(iterate.next());
//		}
		//using Linked HashTable
				Map map=new Hashtable();
				map.put(new Employee("bhanu"),new String("29"));
				map.put(new Employee("varun"),new String("35"));
				map.put(new Employee("prakash"),new String("45"));
				map.put(new Employee("nayani"),new String("28"));
				map.put(new Employee("prakash"),new String("45"));
				map.put(new Employee("prakash"),new String("30"));
				
				Iterator iterate=map.entrySet().iterator();
				while(iterate.hasNext()) {
					System.out.println(iterate.next());
				}

		
		
	}

}
