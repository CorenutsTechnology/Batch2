//Write a program to get key and values at a time from HasMap.
package com.crnts.map;

import java.util.HashMap;

public class GetKey_Values {
	public static void main(String[] args) {
		GetKey_Values hash=new GetKey_Values();
		hash.entries();
	}
	

	public void entries()
	{
		HashMap<Integer, String> hash=new HashMap();
		hash.put(3, "Zoe");
		hash.put(20, "Daniel");
		hash.put(1, "Jack");
		hash.put(11, "Abhi");
		
	   System.out.println(hash.entrySet());
	}
}
