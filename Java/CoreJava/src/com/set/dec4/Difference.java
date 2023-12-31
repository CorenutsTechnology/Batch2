package com.set.dec4;

import java.util.*;

public class Difference 
{
	public static void hashSetMethod()
	{
		//it doesn't follow insertion order , and do not sort the elements ,it allow heterogenous type elements
		//it allow null values
		HashSet<Student> set = new HashSet<>();
		set.add(new Student(1,"pravali",9.8));
		set.add(new Student(2,"gowri",96.0));
		set.add(new Student(3,"ambika",95.0));
		set.add(new Student(4,"rubeena",95.0));
		set.add(new Student(4,"rubeena",95.0));
//		set.add(100);
		set.add(null);
//		set.add(null);
		
//		System.out.println("hashset values:\n  "+set);
		Iterator<Student> iterator = set.iterator();
		System.out.println("LinkedHashset:");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void linkedListMethod()
	{
		//it will follow insertion order , and do not sort the elements ,it allow heterogenous type elements
		//it allow null values
		LinkedHashSet set = new LinkedHashSet<>();
		set.add(new Student(1,"pravali",9.8));
		set.add(new Student(2,"gowri",9.6));
		set.add(new Student(3,"ambika",9.5));
		set.add(new Student(4,"rubeena",9.5));
		set.add(new Student(4,"rubeena",9.5));
		set.add(100);
		set.add(null);
//		set.add(null);
		
//		System.out.println("hashset values:\n  "+set);
		Iterator<Student> iterator = set.iterator();
		System.out.println("Hashset:\n");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		Difference difference = new Difference();
		difference.linkedListMethod();
		difference.hashSetMethod();
	}
	
}
