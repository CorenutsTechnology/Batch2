//9. Declare final method and try to override that method in subclass.
package com.accessmodifiers.nov15;

public class Question9 extends Question8
{
//	public final void finalMethod()
//	{
//		System.out.println("its final method");
//	}
	public static void main(String[] args) {
		Question9 object = new Question9();
		object.finalMethod();
		/*
		 * final methods can be inherited ,but can not be overriden
		 */
	}
}
