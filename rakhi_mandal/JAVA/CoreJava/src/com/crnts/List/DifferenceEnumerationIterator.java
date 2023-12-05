//Write a program to show difference between Iterator and Enumeration
package com.crnts.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DifferenceEnumerationIterator {

	public static void main(String[] args) {
		DifferenceEnumerationIterator compare = new DifferenceEnumerationIterator();
		System.out.println("-------------------vectorWithIterator------------------------");
		compare.withEnumeration();

		System.out.println("-------------------vectorWithEnumeration------------------------");
		compare.withIterator();
	}

	public void withIterator() {
		//works in all type of list
		Vector<String> vector = new Vector();
		vector.add("rakhi");
		vector.add("neha");
		vector.add("tom");
		vector.add("jack");
		vector.add("swati");
		System.out.println(java.time.LocalTime.now());
		Iterator<String> listWithIterator = vector.iterator();
		while (listWithIterator.hasNext()) {
			System.out.print(listWithIterator.next() + " ");
		}
		System.out.println();
		System.out.println(java.time.LocalTime.now());
	}

	public void withEnumeration() {
		//work only in Vector
		Vector<String> vector = new Vector();
		vector.add("rakhi");
		vector.add("neha");
		vector.add("tom");
		vector.add("jack");
		vector.add("swati");
		System.out.println(java.time.LocalTime.now());
		Enumeration<String> listWithEnumeration = vector.elements(); // faster
		while (listWithEnumeration.hasMoreElements()) {
			System.out.print(listWithEnumeration.nextElement() + " ");
		}
		System.out.println();
		System.out.println(java.time.LocalTime.now());
	}

}
