//	Write a program to print list elements in forward and backward direction?
package com.crnts.List.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIn2Direction {

	public static void main(String[] args) {
		ListIn2Direction list =new ListIn2Direction();
		System.out.println("-----------forwardDirection------------");
		list.forwardDirection();
		System.out.println("-----------backwardDirection------------");
		list.backwardDirection();
	}
	public void forwardDirection()
	{
		ArrayList<Student>array =new ArrayList();
		array.add(new Student(1, "tom", "CBSE"));
		array.add(new Student(26, "jack", "CBSE"));
		array.add(new Student(3, "joe", "ICSE"));
		array.add(new Student(2, "jerry", "CBSE"));
		array.add(new Student(3, "abhi", "ICSE"));
		
		Iterator<Student> iterator=array.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+" ");
		}
	}
	
	public void backwardDirection()
	{
		ArrayList<Student>array =new ArrayList();
		array.add(new Student(1, "tom", "CBSE"));
		array.add(new Student(26, "jack", "CBSE"));
		array.add(new Student(3, "joe", "ICSE"));
		array.add(new Student(2, "jerry", "CBSE"));
		array.add(new Student(3, "abhi", "ICSE"));
		
		ListIterator<Student> list_Iterator=array.listIterator(array.size());
		while(list_Iterator.hasPrevious())
		{
			System.out.println(list_Iterator.previous()+" ");
		}
	}


}
