package com.org.Collection4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeSet {

	public static void main(String[] args) {
//		Set hashSet=new HashSet();
//		hashSet.add(10);
//		hashSet.add(30);
//		hashSet.add(20);
//		hashSet.add(80);
//		hashSet.add(70);
//		for(Object obj:hashSet)
//		{
//			System.out.println(obj);
//		}

//		Set linkedhash = new LinkedHashSet<>();
//		linkedhash.add(40);
//		linkedhash.add(30);
//		linkedhash.add(20);
//		linkedhash.add(10);
//		linkedhash.add(50);
//		for (Object obj : linkedhash) {
//			System.out.println(obj);
//		}
		
		TreeSet link=new TreeSet<>();
		link.add(10);
		link.add(30);
		link.add(50);
		link.add(20);
		for (Object obj : link) {
			System.out.println(obj);
		}

	}

}
