package com.crnt.constructors.nov2323;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		this(23,"dt");
		System.out.println("default constructor");
		
	}
    public ConstructorOverloading(int a) {
    	
    	System.out.println("the value of a is : "+a);
		
	}
public ConstructorOverloading(int a , String s) {
	this(23);
	System.out.println("the value of a and s is : "+a+"  :::  "+s);
	
}

	
	

}
