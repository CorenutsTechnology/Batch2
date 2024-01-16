package com.feuji4dec;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet 
{
	public void hashSet(Set<Product>set)
	{
		set.add(new Product("oneplus",20000));
		set.add(new Product("Oppo",20000));
		set.add(new Product("vivo",2000));
		set.add(new Product("oneplus",20000));
		Iterator<Product>iterator= set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public void treeSet(Set<Product> set)
	{
		set.add(new Product("oneplus",30000));
		set.add(new Product("oppo",15000));
		set.add(new Product("vivo",20000));
		set.add(new Product("oneplus",25000));
		Iterator<Product>iterator= set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args)
	{
		HashSetAndTreeSet elements=new HashSetAndTreeSet();
		Set<Product>set1=new HashSet<>();
		elements.hashSet(set1);
//		Product p1=new Product();
//		Set<Product>set2=new TreeSet(p1);
//		System.out.println("treeset");
//		elements.treeSet(set2);
	}

}
