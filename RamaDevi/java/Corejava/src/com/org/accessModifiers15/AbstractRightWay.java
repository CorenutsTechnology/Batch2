package com.org.accessModifiers15;

abstract class  AbstractRightWay1 {

	int intValue=20;
	public abstract void abstractMethod(); 

}
class Child extends AbstractRightWay1
{

	public void abstractMethod()
	{
		System.out.println("abstract method");
	}
}
public class AbstractRightWay
{
	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.intValue);
		child.abstractMethod();
	}
}
