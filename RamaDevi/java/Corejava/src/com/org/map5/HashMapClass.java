package com.org.map5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
	Map<String,String> map=new HashMap();
	map.put("rama","2");
	map.put("abhi","4");
	map.put("sandy","7");
	map.put("dhana","9");
	map.put("rama","2");
	System.out.println(map);
	//iterate over entryset
	 for (Map.Entry<String, String> e : map.entrySet())
         System.out.println("Key: " + e.getKey()
                      + " Value: " + e.getValue());
	 
	 // using keySet() for iteration over keys 
     for (String name :map.keySet())  
         System.out.println("key: " + name); 
       
     // using values() for iteration over values 
     for (String url :map.values())  
         System.out.println("value: " + url); 
     
     // using iterators 
     Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 
       
     while(itr.hasNext()) 
     { 
          Map.Entry<String, String> entry = itr.next(); 
          System.out.println("Key = " + entry.getKey() +  
                              ", Value = " + entry.getValue()); 
     } 
	 
  // looping over keys 
     for (String name : map.keySet())  
     { 
         // search  for value 
         String url = map.get(name); 
         System.out.println("Key = " + name + ", Value = " + url); 
     } 
	
	}

}
