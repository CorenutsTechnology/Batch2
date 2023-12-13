package com.org.list30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListCheck {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add('k');
		list.add("corenuts");
		list.add(40);
		list.set(1,70);
		System.out.println(list.getClass());
		
		
		for(Object lists:list)
		{
			System.out.println(lists);
		}
		
//		Set set=new HashSet();
//		set.add(10);
//		set.add(20);
//		set.add(30);
		
	}

}
