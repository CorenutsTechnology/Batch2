//3. Write a program to print a collection?
package com.crnts.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import arrays.Person;

public class PrintACollection {

	public static void main(String[] args) {
		PrintACollection printACollection =new PrintACollection();
		printACollection.display();
	}
	
	void display()
	{
		List<Person> list=new ArrayList<>();
		list.add(new Person(1,"tom"));
		list.add(new Person(2,"jack"));
		list.add(new Person(3,"jakie"));
		
		Iterator<Person> listWithIterator=list.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
	}

}
