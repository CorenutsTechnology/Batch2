package com.feuji15nov;

public class AccModifiers2 
{
	AccessModifiers modifire=new AccessModifiers();
	public AccModifiers2()
	{
		//AccessModifiers.add(10,10);
	}
	public void print()
	{
		System.out.println("a values "+modifire.a);
		//System.out.println(modifire.b);//Access modifire b is not visible becoz b is private
		System.out.println(modifire.c);
		System.out.println("string in accmodiers"+modifire.result);
		modifire.display();
	}
	public static void main(String[] args) 
	{
		AccModifiers2 result=new AccModifiers2();
		result.print();
	}

}
