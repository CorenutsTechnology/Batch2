package com.crnt.test.nov;

import Interface_Collection.MethodOverriding;

public class MethodOverring_21 implements MethodOverriding{
public static void main(String[] args) {
	MethodOverring_21 methodOverring=new MethodOverring_21();
	methodOverring.methodOverriding();
	SubClasss subClasss=new SubClasss();
			subClasss.submethod();
	
}

@Override
public void methodOverriding() {
	// TODO Auto-generated method stub
	
//	superClass.submethod();
}
}
class SuperClass {
	public void submethod() {
		int x=10;
		System.out.println(x);
	}
}
class SubClasss extends SuperClass{
public void submethod() {
	super.submethod();
	int y=20;
	
		System.out.println(y);
	}
}

