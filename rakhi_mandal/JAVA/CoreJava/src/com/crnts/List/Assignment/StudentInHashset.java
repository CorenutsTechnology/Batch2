//3 .Write a program to add duplicate Student elements to hash set objects and display the unique Student elements as output?
package com.crnts.List.Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class StudentInHashset {

	public static void main(String[] args) {
		StudentInHashset studentInHashset =new StudentInHashset();
		studentInHashset.displayHasSet();
	}
	public void displayHasSet()
	{
		HashSet<Student> hasSet=new HashSet(); 
		hasSet.add(new Student(12,"Tom","ICSE"));
		hasSet.add(new Student(1,"Rakhi","CBSE"));
		hasSet.add(new Student(12,"Tom","ICSE"));
		hasSet.add(new Student(10,"Tom","ICSE"));
		hasSet.add(new Student(88,"Jerry","CBSE"));
		hasSet.add(new Student(88,"Jerry","CBSE"));
	
	
		
		Iterator<Student> listWithIterator=hasSet.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
	}

}
