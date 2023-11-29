package com.crnt.test.nov;

public interface Calculate {
	int value=30;
 void calculate();
}
class SubClass implements Calculate{
	public void calculate() {
		System.out.println("implements the code");
	}
}

abstract class AbstractClass{
	abstract void Abstractmethod() ;
	void concreateMethod() {
		System.out.println("concreate method");
	}
}
class SubClass1 extends AbstractClass{
	 void Abstractmethod() {
		 System.err.println("extended class");
	 }
}