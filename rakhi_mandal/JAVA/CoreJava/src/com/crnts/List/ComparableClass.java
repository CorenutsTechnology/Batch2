package com.crnts.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {

	public static void main(String[] args) {
		ComparableClass comparable =new ComparableClass();
		comparable.arrayList();
	}
	public void arrayList() {
		List<User> list = new ArrayList<>();
		list.add(new User(1,"rakhi",2002));
		list.add(new User(12,"neha",2018));
		list.add(new User(3,"tom",2008));
		list.add(new User(14,"abhi",2006));
		
		
		System.out.println("List before sorting : "+list);
//		Collections.sort(list);
		Collections.sort(list,new ComparatorClass());
		System.out.println("List after sorting : "+list);

	}

}
