package com.feuji21nov;

public class CompileTimePolymorphism 
{
	//3rd 
	public void addition()
	{
		System.out.println("Addition");
	}
	public void addition(int a,int b)
	{
		System.out.println("Addition of two integer numbers:"+(a+b));
	}
	public void addition(double a,int b)
	{
		System.out.println("Addition of  integer and double numbers:"+(a+b));
	}
	public void addition(double a,double b)
	{
		System.out.println("Addition of two double numbers:"+(a+b));
	}
    public static void main(String[] args) 
    {
    	CompileTimePolymorphism  result=new CompileTimePolymorphism();
    	result.addition();
    	result.addition(10,20);
    	result.addition(22.3, 0.7);
		
	}


}
