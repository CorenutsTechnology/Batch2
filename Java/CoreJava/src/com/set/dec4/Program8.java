package com.set.dec4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Program8
{
	public void setMethod()
	{
		//sorts the elements 
		TreeSet<Employee> set = new TreeSet<>();
		set.add(new Employee(1,"raj",5668.3));
		set.add(new Employee(2,"kani",4568.3));
		set.add(new Employee(3,"sony",7338.3));
		set.add(new Employee(4,"rani",6668.3));
		
		Iterator<Employee> iterator = set.iterator();
		System.out.println("Employee set:\n");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	
	public void listMethod() {
		List<String> list = new LinkedList<>();
		list.add("Pravalika");
		list.add("Gowthami");
		list.add("Harshitha");
		list.add("Vandana");
		list.add("Gowthami");

		System.out.println("printing List in forward direction:");

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("printing List in backward direction:");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
	
}
