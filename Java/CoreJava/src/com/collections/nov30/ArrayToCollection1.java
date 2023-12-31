package com.collections.nov30;
import java.util.*;
public class ArrayToCollection1 
{
	public String convert()
	{
		try {
			List<Integer> list = Arrays.asList(12,3,2);
			System.out.println(list);
			
			List<String> list2 = List.of("hello","hi");
			System.out.println(list2);
			return "success";
		}catch(Exception e)
		{
			return "failed";
		}
	}
	
	
}
