package com.org.map5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WithOutKeys {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap();
		map.put("rama","2");
		map.put("abhi","4");
		map.put("sandy","7");
		map.put("dhana","9");
		map.put("rama","8");
		map.size();
		//using iterator
	Iterator<Map.Entry<String,String>> iterate=map.entrySet().iterator();
	while(iterate.hasNext())
	{
		System.out.println(iterate.next());
	}
	}

}
