package com.crnuts.genericClass;

public class GenericMethod {

	
	public  <T> void genericDisplay(T t){
		System.out.println("Method Generic Type ("+t+")= "+ t.getClass().getName());
	}
	

}
