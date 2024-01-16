package com.asignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet {
	public void hashSet(Set<Employee> set) {
		set.add(new Employee(1, "Jyothi", 30000.50));
		set.add(new Employee(2, "Puri", 40000.50));
		set.add(new Employee(3, "Indu", 35000.50));
		set.add(new Employee(4, "Richi", 30000.50));
		set.add(new Employee(5, "Akshu", 30000.50));
		set.add(null);
		set.add(null);
		Iterator<Employee> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

//	public void treeSet(Set<Employee> set)
//	{
//		set.add(new Employee(1,"Jyothi",30000.50));
//		set.add(new Employee(2,"Puri",40000.50));
//		set.add(new Employee(3,"Indu",35000.50));
//		set.add(new Employee(4,"Richi",30000.50));
//		set.add(new Employee(5,"Akshu",30000.50));
//		Iterator<Employee> iterator =set.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
//
//	}
	public void linkedHashSet(Set<Employee> set) {
		set.add(new Employee(1, "Jyothi", 30000.50));
		set.add(new Employee(2, "Puri", 40000.50));
		set.add(new Employee(3, "Indu", 35000.50));
		set.add(new Employee(4, "Richi", 30000.50));
		set.add(new Employee(5, "Akshu", 30000.50));
		
		set.add(null);
		set.add(null);
		Iterator<Employee> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		HashSetAndTreeSet elements = new HashSetAndTreeSet();
		Set<Employee> hashSet = new HashSet<>();
		elements.hashSet(hashSet);
		Set<Employee> linkedHashSet = new LinkedHashSet<>();
		System.out.println("Linked hash Set");
		elements.linkedHashSet(linkedHashSet);
	}

}
