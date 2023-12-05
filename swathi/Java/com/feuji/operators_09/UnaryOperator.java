package com.feuji.operators_09;

public class UnaryOperator {
	
	public int postIncrement(int value) {
		 value++;
		System.out.println("post increment ->"+ value++);
		return value;
		
		
	}
	public int preIncrement(int value) {
		 ++value;
		System.out.println("pre increment ->"+ ++value);
		return value;
		
		
	}
	public int postDecrement(int value) {
		 value--;
		System.out.println("post decrement ->"+value);
		return value;
		
		
	}
	public int preDecrement(int value) {
		--value;
		System.out.println("pre decrement ->"+ value);
		return value;
		
		
	}
	
	

}
