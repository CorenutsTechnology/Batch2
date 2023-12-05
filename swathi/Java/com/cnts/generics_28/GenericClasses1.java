package com.cnts.generics_28;

import java.util.ArrayList;

public class GenericClasses1 {

	public void program1() {
		System.out.println("Without Generic type ");
		ArrayList list= new ArrayList();
		list.add("Swathi");
		list.add(100);
		list.add(true);
		list.add(34.78);
		
		
		for(Object obj:list) {
			//String s1=(String) obj;//we will get classcastexception
			System.out.println(obj);
		}
		System.out.println("Generic type");
		
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(190);
	//list1.add("swathi");//he method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		list1.add(200);
		list1.add(140);
		list1.add(560);
		list1.add(333);
		
		for(Integer integerValue:list1) {
			System.out.println(integerValue);
		}
		
		
	}
	

}
