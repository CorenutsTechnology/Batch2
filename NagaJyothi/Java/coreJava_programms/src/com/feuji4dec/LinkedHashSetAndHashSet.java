package com.feuji4dec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.feuji30nov.Product;

public class LinkedHashSetAndHashSet
{
	public void hashSet(Set<String>set)
	{
		set.add("jyothi");
		set.add("indu");
		set.add("jyothi");
		set.add(null);
		set.add(null);
		//list.add(true);
		Iterator<String>iterator= set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public void linkedHashSet(Set<Product> set)
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
	public static void main(String[] args) 
	{
		LinkedHashSetAndHashSet set=new LinkedHashSetAndHashSet();
		Set<String>set1=new HashSet<>();
		set.hashSet(set1);
		
		Set<Product>product=new LinkedHashSet<>();
		set.linkedHashSet(product);
		
		
	}

}
