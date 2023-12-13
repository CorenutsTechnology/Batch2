package com.feuji15nov;
class Methods
{
	public final void finalMethod()
	{
		System.out.println("Super class final method");
	}
}
public class AbstractclassMethods extends Methods

{
	//cannot override final method
	/*
	 * public void finalMethod() { System.out.println("sub class final method"); }
	 */
	public static void main(String[] args) 
	{
		
		AbstractclassMethods result=new AbstractclassMethods();
		
	}

}
