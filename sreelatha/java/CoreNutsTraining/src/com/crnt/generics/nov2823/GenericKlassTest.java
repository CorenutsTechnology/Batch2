package com.crnt.generics.nov2823;

import com.crnt.nov07231.Employee;

public class GenericKlassTest {
	public static void main(String[] args) {
		/*
		 * GenericKlass<String> g= new GenericKlass<>(); g.setName("bfdwkb");
		 * //g.setAge(24);
		 * 
		 * System.out.println(g.getName()); System.out.println(g.getClass());
		 * System.out.println(g.getAge());
		 */
		
		
		BoundedTypeParameters bound = new BoundedTypeParameters();
		bound.display1(new Employee());
		bound.display1(6768);
		
	}

}
