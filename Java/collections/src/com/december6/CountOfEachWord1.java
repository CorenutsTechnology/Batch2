package com.december6;
import java.util.*;
import java.util.Map.Entry;
public class CountOfEachWord1
{
	public void count(String[] strArray)
	{
		Map<String ,Integer> map =new HashMap<>();
		int count=0;
		for(String str : strArray)
		{
			if(map.containsKey(str))
			{
				count=map.get(str);
				count++;
				map.put(str,count);
			}
			else
			{
				map.put(str,1);
			}
		}
		
		System.out.println("count of each word is:");
		for(Entry<String,Integer> entry: map.entrySet())
		{
			System.out.println(entry);
		}
	}
	public static void main(String[] args) 
	{
		String str="Core nuts technologies located in Bangalore Core nuts technologies"
				+ " located in hyderabad Core nuts technologies in Hyderabad Core nuts "
				+ "technologies in Bangalore" ;
		
		String[] strArray = str.split(" ");
		
		new CountOfEachWord1().count(strArray);
	}
}
