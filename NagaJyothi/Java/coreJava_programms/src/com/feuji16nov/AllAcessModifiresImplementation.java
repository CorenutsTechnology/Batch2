package com.feuji16nov;

public class AllAcessModifiresImplementation implements AllAccessModifires
{

	@Override
	public void publicMethod() {
		System.out.println("public method");
	}
	

public static void main(String[] args) 
{
	AllAccessModifires result	=new AllAcessModifiresImplementation();	
	result.publicMethod();
	result.defaultMethod();
	AllAccessModifires.staticMethod();
}
	
	

}
