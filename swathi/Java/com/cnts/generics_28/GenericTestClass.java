package com.cnts.generics_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericTestClass {
	
	@Test
	public void testClass() {
		GenericClasses1 genericClasses1 = new GenericClasses1();
		genericClasses1.program1();
		
	}
//	@Test
//	public void genericClassTest() {
//		//GenericClass<String>genericClass = new GenericClass();
//	//	genericClass.setName(123);//The method setName(String) in the type GenericClass<String> is not applicable for the arguments (int)
//		genericClass.setName("Swathi");
//		System.out.println("Name is :"+genericClass.getName());
//		genericClass.setLocation("Bangalore");
//		System.out.println("Location is : "+genericClass.getLocation());		
//		
//	}
//	@Test
//	public void genericMethodTest() {
//		GenericMethod genericMethod = new GenericMethod();
//		//genericMethod.<Integer>calculate("dfgh", 34);//The parameterized method <Integer>calculate(Integer, Integer) of type GenericMethod is not applicable for the arguments (String, Integer)
//		genericMethod.<Integer>display(23, 34);
//		GenericClass <Integer>genericClas= new GenericClass();
//		GenericClass <Integer>genericCla= new GenericClass();
//		genericMethod.<Integer>displayMethod(genericClas,genericCla);	
//		
//	}
	
	@Test
	public void upperBoudTest() {
		UpperBoundGeneric upperBoundGeneric = new UpperBoundGeneric();
		ArrayList list= new ArrayList();
		list.add(23.5);
		list.add(238);
		list.add(123456l);
		list.add(23456.89f);
		upperBoundGeneric.display(list);
		ArrayList list1= new ArrayList();
		list1.add(34);
		list1.add(56);
		list1.add(1231234l);
		double result=upperBoundGeneric.sum(list1);
		System.out.println("The result is :"+result);
		List<Integer> list2 = Arrays.asList(1,5,88);
		upperBoundGeneric.displayList(list2);
	}
	
	

}
