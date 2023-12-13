package com.feuji15nov;

  abstract class NonAcessModiFinal
 {
	 final int a=10;
	 final void accessFinal()
	 {
		// a=20;//a canont be assigned
		 System.out.println(a);
	 }
	 public abstract void abstractMethod();
 }
public class NonAcessModifires extends NonAcessModiFinal
{

	@Override
	public void abstractMethod() {
		System.out.println("completed the abstract method");
		
	}
	public static void main(String[] args) 
	{
		NonAcessModifires result=new NonAcessModifires();
		result.abstractMethod();
		result.accessFinal();
		System.out.println("variable:"+result.a);
		//result.a=20;
		
	}
	
 
}
