package com.crnt.generics.nov2823;

import com.crnt.nov07231.Employee;

public class BoundedTypeKlass {
	public <T extends Comparable <Integer>> void compareTo(T value1 , T value2)
	{
		System.out.println(value1.equals(value2));
	}
	public static void main(String[] args) {
		BoundedTypeKlass klass = new BoundedTypeKlass();
		//klass.compareTo((T) new Employee("raju", 1000), null);
	}

}
