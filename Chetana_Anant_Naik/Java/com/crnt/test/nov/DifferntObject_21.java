package com.crnt.test.nov;

public class DifferntObject_21 {
	public static void main(String[] args) {
		Class4 class4=new Class4();
		class4.method1();
		
		Class5 class5=new Class5();
		class5.method1();
	}
}
class Class4{
	void method1() {
		System.out.println("method2");
	}
}
class Class5 extends Class4{
	
	void method1() {
		System.out.println("method1");
	}
}
