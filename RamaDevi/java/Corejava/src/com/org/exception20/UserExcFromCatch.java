package com.org.exception20;

public class UserExcFromCatch {

	public static void main(String[] args) throws ProperAgeException  {
		int age=15;
		try
		{
			System.out.println("main start");
			if(age<=18)
				throw new ProperAgeException();
			
		}
		catch(ProperAgeException e) {
			System.out.println("handled");
			throw new ProperAgeException();
		}
		System.out.println("main end");
	}

}
