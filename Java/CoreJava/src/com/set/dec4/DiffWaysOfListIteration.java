package com.set.dec4;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class DiffWaysOfListIteration 
{
	public void method() {
		List<String> list = new LinkedList<>();
		list.add("Pravalika");
		list.add("Gowthami");
		list.add("Harshitha");
		list.add("Vandana");
		list.add("Gowthami");
		list.add(5,"priya");
		list.set(5,"raj");

		
		System.out.println("printing List in forward direction:");

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("printing List in backward direction:");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}
	public static void main(String[] args) {
		DiffWaysOfListIteration diffWaysOfListIteration = new DiffWaysOfListIteration();
		diffWaysOfListIteration.method();
	}
	
	
}
