package com.crnt.test.nov;

public class NonAccessSpecifier_16 {
public static void main(String[] args) {
	ExtendsClass2 extendsClass=new ExtendsClass2();
	extendsClass.abstractMethod();
	extendsClass.finalMethod();

}
}
class ExtendsClass2 extends finalClass2{
	void abstractMethod() {
		System.out.println("extended class");
	}
}
abstract class finalClass2 {
	final void finalMethod() {
		System.out.println("final method  2");
	}
	abstract void abstractMethod() ;
	
}

