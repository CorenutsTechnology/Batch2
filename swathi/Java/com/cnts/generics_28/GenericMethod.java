package com.cnts.generics_28;

public class GenericMethod {
	
	public <T> void  displayMethod(GenericClass<T> value1,GenericClass<T> value2) {
		System.out.println(value1);
		System.out.println(value2);	
	}
		
	public <T>void display(T value1,T value2) {
	  System.out.println("value 1 is :"+value1);
	  System.out.println("value 2 is :"+value2);	
	}

}
