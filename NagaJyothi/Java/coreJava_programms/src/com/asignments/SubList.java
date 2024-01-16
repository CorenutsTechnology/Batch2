package com.asignments;

import java.util.ArrayList;
import java.util.List;

public class SubList 
{
	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<>();
		//List<String> list2=new 
		list.add("jyothi"); 
		list.add("puri");
		list.add("indu");
		list.add("raji");
		list.add("richi");
		List<String> subList=list.subList(1, 4);
		System.out.println(subList);
				
		
	}
	
}
