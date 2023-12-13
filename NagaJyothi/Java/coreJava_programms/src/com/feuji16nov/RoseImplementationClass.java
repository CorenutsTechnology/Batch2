package com.feuji16nov;

public class RoseImplementationClass implements Rose
{
	@Override
	public void clolour() {
		System.out.println("Red");
		
	}

	@Override
	public void type() {
		System.out.println("Rose flower");
		
	}

	@Override
	public void category() {
		System.out.println("");
		
	}
	public static void main(String[] args)
	{
		RoseImplementationClass result=new RoseImplementationClass();
		result.category();
		result.clolour();
		result.type();
		
	}

}
