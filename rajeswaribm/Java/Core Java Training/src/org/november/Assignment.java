package org.november;


public class Assignment {
	
	public static void main(String[] args) {
		SingleTon obj1=SingleTon.createObj();
		SingleTon obj2=SingleTon.createObj();
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	
}