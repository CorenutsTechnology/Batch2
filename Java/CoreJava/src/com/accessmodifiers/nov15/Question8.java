//8. Declare final variables and try to change the value of that variable within the class
// and in another class.

package com.accessmodifiers.nov15;

public class Question8 	
{
	public final String name="sapna";
	final  int age =10;
	
	public void change()
	{
		//name="raj"; we can not modify final member variables inside of class
	}
	
	public final void finalMethod()
	{
		System.out.println("its final method");
	}
}
