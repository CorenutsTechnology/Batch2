package com.cnts.collections_30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DisplayList {
	List<Integer> list1=new ArrayList<Integer>();
 	public void displayMethod() {
 		list1.add(10);
 		list1.add(40);
 		list1.add(60);
 		list1.add(70);
 		list1.add(90);
 		
 		for(Integer list:list1) {
 			System.out.println(list);
 		}
 		//System.out.println(list1);
		
		
	}
 	
 	public void displayUsingIterator() {
 		list1.add(10);
 		list1.add(40);
 		list1.add(60);
 		list1.add(70);
 		list1.add(90);
 		Iterator<Integer> intValues= list1.iterator();
 		while(intValues.hasNext()) {
 			System.out.println(intValues.next());
 		}
 		//System.out.println(list1);
 		
 	}

}
