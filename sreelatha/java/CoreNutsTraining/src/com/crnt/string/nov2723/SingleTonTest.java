package com.crnt.string.nov2723;

public class SingleTonTest {
	public static void main(String[] args) {
		
		SingleTonClass singleTonClass = SingleTonClass.getInstance();
		System.out.println(singleTonClass.hashCode());
		singleTonClass.hello();
		singleTonClass.day();
		
		
		
		
		
		
		  singleTonClass = SingleTonClass.getInstance();
		System.out.println(singleTonClass.hashCode());
		singleTonClass.hello();
		singleTonClass.day();
	}
	

}
