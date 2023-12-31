package com.singletonclass.nov27;

public class SingleTonImpl 
{
	public static void main(String[] args) 
	{
		//early initilization

		SingleTon instance1 =SingleTon.getInstance();
		SingleTon instance2 =SingleTon.getInstance();
		if(instance1.equals(instance2))
		{
			System.out.println("equal");
		}
				
		//lazy initilization
		SingleTon2 instance3 =SingleTon2.getInstance();
		SingleTon2 instance4 =SingleTon2.getInstance();
		if(instance3.equals(instance4))
		{
			System.out.println("equal");
		}
	}
}
