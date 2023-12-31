package com.set.dec4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StudentsSet 
{
	public static void method()
	{
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"pravali",9.8));
		set.add(new Student(2,"gowri",9.6));
		set.add(new Student(3,"ambika",9.5));
		set.add(new Student(4,"rubeena",9.5));
		set.add(new Student(4,"rubeena",9.5));
		
		System.out.println("before sorting");
		set.stream().forEach(System.out::println);
		TreeSet<Student> set2 = new TreeSet<>(set);
		System.out.println("before sorting");
		set2.stream().forEach(System.out::println);
		
//		Stream s =	set.stream().map((e)->e.getSno());
//		  s.sorted().forEach((e)->System.out.println(e));
	
	}
	
	public static void main(String[] args) {
		StudentsSet set = new StudentsSet();
		set.method();
	}
}
