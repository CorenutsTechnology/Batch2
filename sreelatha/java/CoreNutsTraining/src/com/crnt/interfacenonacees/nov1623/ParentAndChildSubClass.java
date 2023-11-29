package com.crnt.interfacenonacees.nov1623;

public class ParentAndChildSubClass implements ChildInterface{
	public static void main(String[] args) {
		ParentAndChildSubClass p = new ParentAndChildSubClass();
		p.parent();
		p.child();
	}

	@Override
	public void parent() {
		System.out.println("it is a parent interface");
		
	}

	@Override
	public void child() {
		System.out.println("it is a child interface");
		
	}

}
