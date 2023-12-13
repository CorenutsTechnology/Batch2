package com.feuji30nov;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorAndEnumaration 
{
	public void test(List<Student> list)
	{
		list.add(new Student(1,"Jyothi",20,"hyd"));
		list.add(new Student(2,"indu",22,"Guntur"));
		list.add(new Student(3,"puri",24,"Guntur"));
		list.add(new Student(4,"richi",22,"hyd"));
		list.add(new Student(5,"supriya",24,"vijayawada"));
		Iterator<Student>iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public void testVector(Vector<Student> vector)
	{
		vector.add(new Student(1,"Jyothi",20,"hyd"));
		vector.add(new Student(2,"indu",22,"Guntur"));
		vector.add(new Student(3,"puri",24,"Guntur"));
		vector.add(new Student(4,"richi",22,"hyd"));
		vector.add(new Student(5,"supriya",24,"vijayawada"));
		Enumeration<Student> enumaretor=vector.elements();
		while(enumaretor.hasMoreElements())
		{
			System.out.println(enumaretor.nextElement());
		}
		  
		 
	}
}