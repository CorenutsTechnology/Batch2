package com.feuji_07;

public class Variables {
	
	static int VALUE1 = 10;
	static int VALUE2 = 20;
	
	public int add() {
		int result =VALUE1+VALUE2;
		return result;
	}
	public static void main(String[] args) {
		Variables var = new Variables();
		System.out.println(var.add());
	
	}
	
}

