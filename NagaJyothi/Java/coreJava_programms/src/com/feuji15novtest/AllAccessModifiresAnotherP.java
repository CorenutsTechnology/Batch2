package com.feuji15novtest;

import com.feuji15nov.AllAccessModifires;

public class AllAccessModifiresAnotherP extends AllAccessModifires
{
	//AllAccessModifires modifires=new AllAccessModifires();
	
	public void displayResult()
	{
		System.out.println(value1);
		System.out.println(value4);
		publicMethod();
		//privateMethod();
		protectedMethod();
		//defaultMethod();
	}
	public static void main(String[] args) 
	{	
		  AllAccessModifiresAnotherP result=new AllAccessModifiresAnotherP();
		  result.displayResult();
		 
		/*
		 * AllAccessModifires modifires=new AllAccessModifires();
		 * modifires.publicMethod();
		 */
		
	}

}
