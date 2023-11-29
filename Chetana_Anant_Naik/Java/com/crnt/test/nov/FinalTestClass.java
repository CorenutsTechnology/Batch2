package com.crnt.test.nov;

public class FinalTestClass {
	
public static void main(String[] args) {
	FinalTestClass1 class1 =new FinalTestClass1();
	class1.finalMethod1();
	
	finalExtendsClass class2=new finalExtendsClass();
	class2.finalMethod2();
}
}
class finalExtendsClass extends finalExtendsClass2{

	public void finalMethod1() {
		System.out.println("final method  1");
	}

}
final class FinalTestClass1 extends finalExtendsClass{
public int value=10;
public void finalMethod() {
	System.out.println("final method");
}
}
class finalExtendsClass2 {
	final void finalMethod2() {
		System.out.println("final method  2");
	}
}