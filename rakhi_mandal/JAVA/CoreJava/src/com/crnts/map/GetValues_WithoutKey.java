//Write a program to get values from HashMap without using keys.
package com.crnts.map;

import java.util.HashMap;


public class GetValues_WithoutKey {
	public static void main(String[] args) {
		GetValues_WithoutKey withoutKey =new GetValues_WithoutKey();
		
		withoutKey.values();
	
	}
	public void values()
	{
		HashMap<Integer, String> hash=new HashMap();
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
	   System.out.println(hash.values());
	}
}
