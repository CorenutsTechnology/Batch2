package com.december6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SetClass {

	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("pravalika",12);
		map.put("pravalika", 13);
		map.put("pra", 14);
		map.put(null,14);
		System.out.println(map.values());
		
	}

}
