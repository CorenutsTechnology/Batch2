package com.feuji6dec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.feuji4dec.ArrayList;

public class CountWords 
{
	public void count(String s)
	{
		 String[]name=s.split(" ");
		 List<String> list=new java.util.ArrayList<>();
		 for(int index=0;index<=name.length-1;index++)
		 {
			list.add(name[index]);
		 }
		 
		Map<String,Integer>map=new HashMap<>();
		int count=0;
		for(String result:list)
		{
			if(map.containsKey(result))
			{
				count=map.get(result);
				count++;
				map.put(result, count);
				
			}
			else
			{
				map.put(result,1);
			}
			
		}
		for(Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"- "+entry.getValue());
			
		}
		
		
		
	}
	public static void main(String[] args) {
		String name="Core nuts technologies located in Bangalore "
				+"Core nuts technologies located in  hyderabad "
				+"Core nuts technologies located in  Hyderabad "
				+"Core nuts technologies in Bangalore ";
		CountWords words=new CountWords();
		words.count(name);
		
		}

}
