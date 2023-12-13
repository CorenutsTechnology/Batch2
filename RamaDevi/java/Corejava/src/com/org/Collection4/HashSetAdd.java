package com.org.Collection4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAdd {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(10);
		System.out.println(set.hashCode());
		System.out.println(set.equals(set));
		set.add(20);
		System.out.println(set.hashCode());
		System.out.println(set.equals(10));
//		set.add(20);
//		System.out.println(set.hashCode());
//		System.out.println(set.equals(set));
//		set.add(30);
//		System.out.println(set.hashCode());
//		System.out.println(set.equals(set));
		Iterator iterate=set.iterator();
//		while(iterate.hasNext())
//		{
//			System.out.println(iterate.next());
//		}
//			
	}
}
