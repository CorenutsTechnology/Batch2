package com.cnts.nov22;

class SuperClass
{
//	public void method1() throws Exception    
	public void method1()
	{
		System.out.println("SuperClas");
	}
}

class SubClass extends SuperClass 
{
	@Override
	public void method1() {      // handel the exception
		super.method1();
		System.out.println("Overriden method of SuperClass");
	}
	public void method2() throws Exception
	{
		System.out.println("Subclass");
	}
	
}
public class Case1 {

	public static void main(String[] args) {
		SubClass class1 = new SubClass();
//		class1.method2();         //handel the checked exception
		class1.method1();
	}
}
