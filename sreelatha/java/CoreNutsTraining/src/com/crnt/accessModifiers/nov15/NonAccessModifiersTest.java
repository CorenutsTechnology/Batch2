package com.crnt.accessModifiers.nov15;

public class NonAccessModifiersTest extends NonAccessModifiers {
	public static void main(String[] args) {
		NonAccessModifiers nonAccessModifiers = new NonAccessModifiersTest();
		nonAccessModifiers.concreteMethod();
		nonAccessModifiers.abstractMethod();
	}

	@Override
	public void abstractMethod() {
		System.out.println("The is an abstract method..");
		
	}

	@Override
	public void concreteMethod() {
		System.out.println("overided concrete method...");
	}

}
