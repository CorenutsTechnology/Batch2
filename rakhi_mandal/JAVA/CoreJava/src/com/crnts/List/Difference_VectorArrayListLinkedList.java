//Show the difference between ArrayList and Vector and LinkedList.

package com.crnts.List;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Difference_VectorArrayListLinkedList {

	public static void main(String[] args) {
		Difference_VectorArrayListLinkedList compare = new Difference_VectorArrayListLinkedList();
		System.out.println("----------------ArrayList-------------------");
		compare.arrayList();
		System.out.println("----------------LinkedList-------------------");
		compare.linkedList();
		System.out.println("----------------Vector-----------------------");
		compare.vector();

	}

	public void arrayList() {
		List<String> list = new ArrayList<>();
		list.add("rakhi");
		list.add("neha");
		list.add("tom");
		list.add("jack");
		list.add("swati");

		System.out.println(java.time.LocalTime.now());

		Iterator<String> listWithIterator = list.iterator();
		while (listWithIterator.hasNext()) {
			System.out.print(listWithIterator.next() + " ");
		}
		System.out.println();
		System.out.println(java.time.LocalTime.now());
		System.out.println("-------------------------------------------");

	}

	public void vector() {
		Vector<String> vector = new Vector();
		vector.add("rakhi");
		vector.add("neha");
		vector.add("tom");
		vector.add("jack");
		vector.add("swati");
		System.out.println(java.time.LocalTime.now());
//		Iterator<String> listWithIterator = vector.iterator();
//		while (listWithIterator.hasNext()) {
//			System.out.print(listWithIterator.next() + " ");
//		}
		
		Enumeration<String> listWithEnumeration= vector.elements();   //faster
		while (listWithEnumeration.hasMoreElements()) {
			System.out.print(listWithEnumeration.nextElement() + " ");
		}
		System.out.println();
		System.out.println(java.time.LocalTime.now());
		System.out.println("-------------------------------------------");
	}

	public void linkedList() {
		LinkedList<String> linkedlist = new LinkedList();
		linkedlist.add("rakhi");
		linkedlist.add("neha");
		linkedlist.add("tom");
		linkedlist.add("jack");
		linkedlist.add("swati");

		System.out.println(java.time.LocalTime.now());
		Iterator<String> listWithIterator = linkedlist.iterator();
		while (listWithIterator.hasNext()) {
			System.out.print(listWithIterator.next() + " ");
		}
		System.out.println();
		System.out.println(java.time.LocalTime.now());
		System.out.println("--------------------------------------------");
	}

}
