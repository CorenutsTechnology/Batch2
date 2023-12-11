//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
package com.crnts.FunctionalInterfaceAssignment;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ListOfStrings {

	
	public static void main(String[] args) {
		ArrayList<String>array =new ArrayList();
		array.add("adam");
		array.add("jack");
		array.add("joe");
		array.add("tom");
	
     BiFunction<ArrayList,String,Boolean> bi=(e1,e2)->{
    	 
    	 boolean bool=array.contains(e2);
			return bool;
	};System.out.println(bi.apply(array, "jack"));
	
}
	}
