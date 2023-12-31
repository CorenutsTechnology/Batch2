package com.singletonclass.nov27;

public class SingleTon
{
	private static final SingleTon instance = new SingleTon();
	public static SingleTon getInstance()
	{
		return instance;
	}
}
