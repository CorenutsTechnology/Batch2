package com.crnt.constructors.nov2323;

public class StaticVariablesConstructor {
	public static int value =20;

	public StaticVariablesConstructor(int value) {
		
		System.out.println("value : "+value);
	}
	public static void main(String[] args) {
		StaticVariablesConstructor StaticVariablesConstructor = new StaticVariablesConstructor(value);
		
		
	}
	

}
