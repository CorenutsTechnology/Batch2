package com.feuji4dec;

import java.util.Set;
import java.util.TreeSet;


public class StudentTreeSet 
{
	public static void main(String[] args) 
	{
		NameComparator n1=new NameComparator();
		Set<Student> student=new TreeSet<>(n1);
		student.add(new Student(20,"jyothi"));
		student.add(new Student(22,"puri"));
		student.add(new Student(23,"indu"));
		System.out.println(student);
		
	}

}
