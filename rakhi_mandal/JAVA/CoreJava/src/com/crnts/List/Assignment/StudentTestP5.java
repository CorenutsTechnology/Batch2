//5 .WAP to add Student elements(duplicates) to set objects and display the element in sort
package com.crnts.List.Assignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;


public class StudentTestP5 {
	ComparatorClass comparatorClass =new ComparatorClass();
	public static void main(String[] args) {
		StudentTestP5 studentTreeSet=new StudentTestP5();
		studentTreeSet.student();
	
	}
	
	public void student()
	{  	ComparatorClass comparatorClass =new ComparatorClass();
		TreeSet<Student> set=new TreeSet<Student>(comparatorClass);

	set.add(new Student(1, "tom", "CBSE"));
	set.add(new Student(26, "jack", "CBSE"));
	set.add(new Student(3, "jakie", "ICSE"));
	set.add(new Student(26, "jack", "CBSE"));
	set.add(new Student(3, "joe", "ICSE"));
	set.add(new Student(13, "adam", "ICSE"));
	set.add(new Student(3, "joe", "ICSE"));
	set.add(new Student(13, "adam", "ICSE"));
//	Collections.sort(comparatorClass);
	
	Iterator<Student> listWithIterator=set.iterator();
	while(listWithIterator.hasNext())
	{
		System.out.println(listWithIterator.next()+" ");
	}
	}
}
