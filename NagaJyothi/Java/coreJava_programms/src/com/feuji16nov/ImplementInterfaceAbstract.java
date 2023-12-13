package com.feuji16nov;

public class ImplementInterfaceAbstract extends AbstractClass implements InterfaceInterface

{

	@Override
	public void interfaceMethod() {
		System.out.println("Interface method");
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract method");
		
	}
	public static void main(String[] args) 
	{
		ImplementInterfaceAbstract result=new ImplementInterfaceAbstract();
		System.out.println(a);
		result.abstractMethod();
		result.interfaceMethod();
		
	}
	

}
