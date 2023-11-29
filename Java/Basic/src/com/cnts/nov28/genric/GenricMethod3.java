package com.cnts.nov28.genric;

public class GenricMethod3 {

	public <T> void method(T value1)
	{
		System.out.println(value1.getClass().getName()+" = "+value1);
	}
	
	public static void main(String[] args) {
		GenricMethod3 method = new GenricMethod3();
		
		method.method(11);
		method.method("String");
		method.method(14.48);
		
	}
}
