package com.cnts.nov23;

public class StaticVariable5 {

	static int value;
	
	public StaticVariable5() {
		System.out.println(value);
		value++;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StaticVariable5 variable = new StaticVariable5();
		
		System.out.println(value);
	}
}
