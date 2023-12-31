package com.set.dec4;

import java.util.*;

public class DifferenceOfTreeSetHashSet 
{
	public  void hashSetMethod()
	{
		//it doesn't follow insertion order , and do not sort the elements ,it allow heterogenous type elements
		//it allow null values
		HashSet set = new HashSet<>();
		set.add(new Student(1,"pravali",9.8));
		set.add(new Student(2,"gowri",9.6));
		set.add(new Student(3,"ambika",9.5));
		set.add(new Student(4,"rubeena",9.5));
		set.add(new Student(4,"rubeena",9.5));
		set.add(100);
		set.add(null);
		set.add(null);
//		System.out.println(new TreeSet(set));
		
		System.out.println("hashset values:");
		print(set);
	}
	
	public void method()
	{
		//it do follow insertion order , and  sort the elements ,it allow only homogenous type elements,
		//it doesn't allow null values
		//the object type that we are storing should be directly or indirectly implement Comparable interface
		
		TreeSet set = new TreeSet();
//		set.add(null);
		
		set.add(11);
//		set.add(9.0); it will throw classCastException
		set.add(2);
		set.add(5);
		set.add(10);
//		set.add(null);
		
		System.out.println("elements in treeset are:");	
		print(set);
	}
	public void print(Set<Student> set) 
	{
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void treeSetMethod()
	{
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(1,"pravali",9.8));
		set.add(new Student(2,"gowri",9.6));
		set.add(new Student(3,"ambika",9.5));
		set.add(new Student(4,"rubeena",9.5));
		set.add(new Student(4,"rubeena",9.5));
		/*
		 * Employee class should implement Comparable interface
		 */
		
		System.out.println("Employee set:\n");
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args)
	{
		DifferenceOfTreeSetHashSet differenceOfTreeSetHashSet = new DifferenceOfTreeSetHashSet();
		differenceOfTreeSetHashSet.hashSetMethod();
		
		differenceOfTreeSetHashSet.treeSetMethod();
	}
}
