package com.org.map5;

import java.util.HashMap;
import java.util.Map;

public class GetKeyValue {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap();
		map.put("rama","2");
		map.put("abhi","4");
		map.put("sandy","7");
		map.put("dhana","9");
		map.put("rama","2");
		
		for(Map.Entry<String,String> ent:map.entrySet())
		{
			System.out.println(ent.getKey()+","+ent.getValue());
		}
		
	}

}
