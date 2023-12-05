package com.cnts.collectionset_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForwardBackwardDirection {
	
	public void displayForwardBackward() {
		
		List<Student> list = new ArrayList();
		list.add(new Student("swathi",1));
		list.add(new Student("bindhu",2));
		list.add(new Student("hari",3));
		list.add(new Student("kalyani",4));
		list.add(new Student("navya",5));
		
		
		Iterator<Student> stdValues= list.iterator();
		while(stdValues.hasNext()) {
			System.out.println(stdValues.next());
		}
		
		ListIterator<Student> s1 = list.listIterator(list.size());
		while(s1.hasPrevious()) {
			System.out.println(s1.previous());
		}
		
		
		
	}
	public static void main(String[] args) {
		ForwardBackwardDirection forwardBackwardDirection = new ForwardBackwardDirection();
		forwardBackwardDirection.displayForwardBackward();	
	}

}
