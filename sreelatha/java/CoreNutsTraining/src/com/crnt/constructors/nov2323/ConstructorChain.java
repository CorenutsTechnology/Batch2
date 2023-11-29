package com.crnt.constructors.nov2323;

public class ConstructorChain {
	public  ConstructorChain()
	{
		this(10);
		System.out.println("test is succesed");
	}
	public ConstructorChain(int i) {
		this("sri",89);
		System.out.println(i);
		
		
	}
	public ConstructorChain(String string, int i) {
		
		this(34.6);
		System.out.println("the name : "+string +" ::: value : "+i);
	}
	public ConstructorChain(double d) {
		System.out.println("the value of double is : "+d);
	}
	
	

}
