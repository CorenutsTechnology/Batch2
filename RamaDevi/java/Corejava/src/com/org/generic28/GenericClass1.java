package com.org.generic28;

public class GenericClass1<T> implements GenericInterface{

	@Override
	public <T> T method1(T obj) {
		
		return obj;
	}

	@Override
	public void method2() {
		System.out.println("method2");
		
	}

	

}
