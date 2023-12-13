package com.org.collection1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
//		Set set=new HashSet();
//		set.add("geeta");
//		set.add("gowri");
//		set.add("dhana");
//		set.add("lakshmi");
//		System.out.println("displaying the set");
//		for(Object values:set)
//		{
//			System.out.println(values);
//		}
		//LinkedHashSet
//		Set set=new LinkedHashSet();
//		set.add("geeta");
//		set.add("gowri");
//		set.add("dhana");
//		set.add("lakshmi");
//		System.out.println("displaying the set");
//		for(Object values:set)
//		{
//			System.out.println(values);
//		}
		
		//TreeSet
		Set set=new TreeSet();
		set.add("geeta");
		set.add("gowri");
		set.add("dhana");
		set.add("lakshmi");
		//Adding duplicate
		set.add("gowri");
		System.out.println("displaying the set");
		for(Object values:set)
		{
			System.out.println(values);
		}
		
		
	}
}
