package com.generic.nov28;

public class ImlInterface2 implements GenericInterface2<Integer>
{
	
	public static void main(String[] args)
	{
		GenericInterface2<Integer> obj = new ImlInterface2();
		Integer value=obj.m1();
		System.out.println(value);
//		GenericInterface<String> obj2 = new ImlInterface2();
//		System.out.println(obj2.m1());
	}

	@Override
	public Integer m1()
	{
		return 10;
	}
	//return type here should should be either Integer or its parent type , but not its super class type

}
