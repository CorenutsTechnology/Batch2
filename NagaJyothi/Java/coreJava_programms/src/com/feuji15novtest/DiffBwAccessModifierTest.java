package com.feuji15novtest;

import com.feuji15nov.DiffBwAccessModifier;

public class DiffBwAccessModifierTest extends DiffBwAccessModifier
{
	public void display()
	{
		protectedMethod();
		//defaultMethod();
	}
	public static void main(String[] args) 
	{
		DiffBwAccessModifierTest test=new DiffBwAccessModifierTest();
		test.display();
		
	}

}
