package com.org.Collection4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add("ram");
		arraylist.add("balu");
		arraylist.add("hari");
		arraylist.add("ram");
		arraylist.add("sindhu");
		arraylist.set(1, "priya");
		for (Object obj : arraylist) {
			System.out.println(obj);
		}
		System.out.println(" ------");
		Set set = new HashSet();
		set.add("ram");
		set.add("bhanu");
		set.add("dhana");
		set.add("siri");
		set.add("siri");
		for (Object obj : set) {
			System.out.println(obj);
		}
	}

}
