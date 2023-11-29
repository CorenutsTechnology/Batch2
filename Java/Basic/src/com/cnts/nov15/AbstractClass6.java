package com.cnts.nov15;

public class AbstractClass6 extends AbstractClass5 {
	public static void main(String[] args) {
		AbstractClass6 class6 = new AbstractClass6();
		System.out.println("Name: "+class6.name);
		System.out.println("Roll no.: "+class6.rollno);
		class6.display();
		class6.display1();
	}

	@Override
	public void display() {
		System.out.println("Overriden abstract method");
	}
}
