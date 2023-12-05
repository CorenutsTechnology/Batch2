package com.cnts.generics_28;

import java.util.ArrayList;

import com.feuji.person_07.Person;


public class BoundedTypeClass{
	
	public <T extends Comparable<String>>  void compare(T value1,T value2) {
		System.out.println(value1.equals(value2));
	
	}
	
	public void display(ArrayList<? super Integer> list) {
		for(Object obj: list) {
			System.out.println(obj);	
		}
		
	}
	public static void main(String[] args) {
		BoundedTypeClass boundedTypeClass = new BoundedTypeClass();
		boundedTypeClass.<String>compare("swathi","bindhu");
		boundedTypeClass.compare( new GenericClass("swathi","bangalore"),new GenericClass("jyothi","hyderabad"));
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(24);
		list.add(123);
		list.add(56);
		boundedTypeClass.display(list);
		
		
		
		
	}

}
