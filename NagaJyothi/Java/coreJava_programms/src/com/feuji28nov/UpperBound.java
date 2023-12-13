package com.feuji28nov;
class A<T> extends UpperBound
{
	
}
class B extends A
{
	
}
class C extends B
{
	
}
public class UpperBound <T>
{
	public void display(UpperBound<? super A> value )	
	{
		
		
	}
	public static void main(String[] args) 
	{
		
		UpperBound res=new UpperBound();
		A a1=new A();
		B b1=new B();
		C c1=new C();
		res.display(a1);
	}

}

