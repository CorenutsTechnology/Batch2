package com.org.accessModifiers15;

public class DiffBwDefaultProtected {

	int defaultValue=20;
	protected int protectValue=30;
	void defaultMethod()
	{
		System.out.println("default method");
	}
	protected  void  protectMethod()
	{
		System.out.println("protected method");
	}
	public static void main(String[] args) {
		DiffBwDefaultProtected diffBwDefaultProtected=new  DiffBwDefaultProtected();
		System.out.println(diffBwDefaultProtected.defaultValue);
		System.out.println(diffBwDefaultProtected.protectValue);
		diffBwDefaultProtected.defaultMethod();
		diffBwDefaultProtected.protectMethod();
	}
}	
	


