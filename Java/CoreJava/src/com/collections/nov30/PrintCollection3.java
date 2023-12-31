package com.collections.nov30;
import java.util.*;
public class PrintCollection3
{
	public String method()
	{
		try {
			List<Integer> list = new ArrayList<>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			//printing list
			for(Integer element:list)
			{
				System.out.print(element+" ");
			}
			System.out.println();
			return "success";
		}catch(Exception e)
		{
			return "failed";
		}
	}
}
