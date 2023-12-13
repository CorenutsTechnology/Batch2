package com.feuji17nov;

public class ArithmeticExceptionClass implements ArithmeticExceptionInterface
{

	@Override
	public void arithmeticExceptionMethod( int array[]) 
	{
		int sum=0;
		for(int index=0;index<=array.length-1;index++)
		{
			sum=sum+index;
		}
		try
		{
			double avg=sum/array.length;
			System.out.println(avg);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		
		
	}
	public static void main(String[] args) 
	{
		ArithmeticExceptionClass result=new ArithmeticExceptionClass();
		result.arithmeticExceptionMethod(new int[] {});
		
	}
	

}
