package com.crnts.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
	static List<Student> list = new ArrayList<>();
	Iterator<Student> listWithIterator = list.iterator();

	public static void main(String[] args) {
		list.add(new Student(1, "tom", "CBSE"));
		list.add(new Student(2, "jack", "CBSE"));
		list.add(new Student(3, "jakie", "Student"));
		StudentTest studentTest = new StudentTest();
		System.out.println("----------------Iterator----------------------");
		studentTest.displayWithIterator();
		System.out.println("------------------For Loop--------------------");
		studentTest.displayWithForLoop();
		System.out.println("------------------For Each--------------------");
		studentTest.displayForEach();
	}

	void displayWithIterator() {
		while (listWithIterator.hasNext()) {
			System.out.println(listWithIterator.next() + " ");
		}
	}

	void displayWithForLoop() {
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index) + " ");
		}
	}
	
	void displayForEach()
	{
		for(Object item:list)
		{
			System.out.println(item+" ");
		}
		System.out.println();
		
	}

}
