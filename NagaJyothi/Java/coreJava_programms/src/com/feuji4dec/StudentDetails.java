package com.feuji4dec;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Set<Student>set=new TreeSet<>(s1);
		
		  set.add(new Student(20,"A")); 
		  set.add(new Student(25,"B"));
		  set.add(new Student(30, "A"));
		  set.add(new Student(20, "B"));
		System.out.println(set);
	}

}
