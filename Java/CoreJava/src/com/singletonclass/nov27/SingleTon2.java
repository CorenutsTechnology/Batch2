package com.singletonclass.nov27;

public class SingleTon2
{
	private static SingleTon2 instance;
	public static SingleTon2 getInstance()
	{
		if(instance == null)
		{
			instance = new SingleTon2();
		}
		return instance;
	}
}
