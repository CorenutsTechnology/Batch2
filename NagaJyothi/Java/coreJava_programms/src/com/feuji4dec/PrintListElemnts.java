package com.feuji4dec;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PrintListElemnts {
	// print list elemnts in forward direction and backward direction
	public void print(List<Student> list) {

		list.add(new Student(20, "Jyothi"));
		list.add(new Student(20, "Indu"));
		list.add(new Student(23, "Puri"));
		/*
		 * list.add(10); list.add(20); list.add(30);
		 */
		ListIterator<Student> iterator = list.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Previous elemnts");
		//ListIterator<Student> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();
		PrintListElemnts elements = new PrintListElemnts();
		elements.print(list);
	}

}
