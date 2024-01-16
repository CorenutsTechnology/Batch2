package com.asignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortTheElementsInSet 
{
	public void sort(Set<Student>student )
	{
		student.add( new Student(101,"Jyothi",24,"Cse"));
		student.add( new Student(102,"Indu",23,"Cse"));
		student.add( new Student(103,"Puri",22,"Cse"));
		student.add( new Student(104,"raji",23,"Ece"));
		student.add( new Student(103,"Puri",22,"Cse"));
		Iterator<Student> iterator =student.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		SortTheElementsInSet result=new SortTheElementsInSet();
		Student s1=new Student();
		Set<Student> set=new TreeSet<Student>(s1);
		result.sort(set);
	}

}
