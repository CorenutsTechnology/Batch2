package com.org.exception17;

public class FinallyWithoutCatch {

	public void exception()
	{
		System.out.println("start");
		try
		{
		int[] array= {6,4,9,3};
		System.out.println(array[7]);
		}
//		catch(Exception e)
//		{
//			System.out.println("handled");
//		}
		finally
		{
			System.out.println("finally handled");
		}
		System.out.println("end");
	}
	
	public static void main(String[] args) {
		FinallyWithoutCatch finallywithoutcatch=new FinallyWithoutCatch();
		finallywithoutcatch.exception();
	}

}
