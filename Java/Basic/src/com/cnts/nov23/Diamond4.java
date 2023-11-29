package com.cnts.nov23;

class ParentClass1
{
	public int sum(int value1,int value2)
	{
		return (value1+value2);
	}
}

class ParentClass2 
{
	public int sum(int value1,int value2)
	{
		return(value1*value2);
	}
}

//public class Diamond4 extends ParentClass2, ParentClass1  
/*
 * as a class could not extend more than one class 
 * if it can then it will lead to diamond problem
 * bcz 
 */

public class Diamond4 extends ParentClass2 {

	public static void main(String[] args)
	{
		Diamond4 diamond = new Diamond4();
		diamond.sum(54, 65);
	}
}
