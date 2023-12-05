//Program 3
package com.crnts.Generics;

public class GenericMethod {

	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod();
		GenericClass<Integer> object1=new GenericClass();
		GenericClass<Integer> object2=new GenericClass(); 
		genericMethod.<Integer>add(object1, object2);   //working with GenericClass<T> value1,GenericClass<T> value2
		genericMethod.<Character>add('t','i');   //working with T value1,T value2
		 
	}
	
	public  <T> void add(GenericClass<T> value1,GenericClass<T> value2)
	{
		 System.out.println("generics method of object");
	}

	public  <T> void add(T value1,T value2)
	{
		 System.out.println("generics method of T type");
	}

}
