package com.generic.nov28;

import java.util.ArrayList;

public class Example 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		list.add("hello");
		list.add(12);
		list.add(23.4);
		list.add("hi");
		list.add(8);
		int sum=0;
		for(Object obj: list)
		{
			if( obj  instanceof Integer)
			{
				sum = sum + (int)obj;
			}
		}
		System.out.println(sum);
	}
}
