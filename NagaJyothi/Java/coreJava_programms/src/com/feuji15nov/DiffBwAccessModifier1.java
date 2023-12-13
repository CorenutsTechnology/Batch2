package com.feuji15nov;

public class DiffBwAccessModifier1 // extends FinalClass//we can create sub class of final class
{
	public static void main(String[] args) 
	{
		DiffBwAccessModifier test=new DiffBwAccessModifier();
		System.out.println(test.a);
		System.out.println(test.value1);
		test.defaultMethod();
		test.protectedMethod();
		
	}

}
