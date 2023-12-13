package com.org.Collection4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add("ram");
		arraylist.add("balu");
		arraylist.add("hari");
		arraylist.add("ram");
		arraylist.add("sindhu");
		arraylist.set(1, "priya");
		java.util.ListIterator iterate=arraylist.listIterator();
		
		while(iterate.hasNext())
		{
			
			String name=(String) iterate.next();
			System.out.println(name);
			System.out.println(iterate.nextIndex());
			
		}
		while(iterate.hasPrevious())
		{
			String prevname=(String)iterate.previous();
			System.out.println(prevname);
			System.out.println(iterate.previousIndex());
		}
	}

}
