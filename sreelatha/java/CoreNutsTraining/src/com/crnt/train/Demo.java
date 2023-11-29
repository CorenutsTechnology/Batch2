package com.crnt.train;

public class Demo {

	public static void main(String[] args) {
//		int i=2;
//		while(false) {
//			System.out.println("while loop");
//		}
		
//		for(int i=0;i<5;i++) {
//			if(i<5) {
//				System.out.println("if block");
//				continue;
//				System.out.println("after block");
//			}
//			System.out.println("for loop");
//		}
		
		do {
			System.out.println("do while");
		}
		while(false);
		if(false) {
			System.out.println("if block");
		}
		
	}
	
	public int add() {
		//return 3+7;
		int a=9;
		System.out.println("method");
		if(7<a) {
			return 9;
		}
		else {
			System.out.println("else");
		}
		return a;
	}

}


