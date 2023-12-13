package com.org.interface16;

 abstract class AbstractClassBean {
	int intValue=70;
public abstract void methodOne();
}
class Child extends AbstractClassBean
{
	public void methodOne()
	{
		System.out.println("abstract implementation in child");
	}
}
class SubChild extends Child
{
	public void methodTwo()
	{
		System.out.println("abstract implementation in sub child");
	}
}
public class AbstractClass 
{
	public static void main(String[] args) {
		//AbstractClassBean abstractClassBean=new AbstractClassBean();
		Child child=new Child();
		child.intValue=90;
		System.out.println("variable is:"+child.intValue);
		child.methodOne();
	}
}
