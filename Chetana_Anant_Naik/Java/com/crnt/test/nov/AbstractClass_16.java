package com.crnt.test.nov;

 class AbstractClass_16 {
			public static void main(String[] args) {
			ExtendsClass1 extendsClass1 =new ExtendsClass1();
			extendsClass1.abstractMehod();
			extendsClass1.abstractMehod();
			extendsClass1.concreateMethod();
			
			
		}
	}

abstract class ExtendsClass extends AbstractClass_16_11{
	void abstractMehod() {
		System.out.println("abstractMehod");
	}
}
class ExtendsClass1 extends  ExtendsClass{
	void abstractMehod1() {
		System.out.println("abstractMehod");
	}
}
class MainClass{
	public static void main(String[] args) {
		ExtendsClass1 extendsClass1 =new ExtendsClass1();
		extendsClass1.abstractMehod();
		extendsClass1.abstractMehod();
		extendsClass1.abstractMehod();
	}
}abstract class AbstractClass_16_11 {
	public void concreateMethod() {
		System.out.println("Concreate Method");
	}
	abstract void abstractMehod();
	abstract void abstractMehod1();
	}