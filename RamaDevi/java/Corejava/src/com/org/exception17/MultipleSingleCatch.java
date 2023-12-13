package com.org.exception17;

public class MultipleSingleCatch {
	String name;
	public void exeception()
	{
		System.out.println("start");
		try
		{
			int number=0;
		System.out.println(name);
		int result=number/0;
		System.out.println("result");
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("end");
	}
	public static void main(String[] args) {
		MultipleSingleCatch multiplesingleCatch=new MultipleSingleCatch();
		multiplesingleCatch.exeception();

	}

}
