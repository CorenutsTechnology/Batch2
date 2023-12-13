package com.feuji17nov;

public class ExceptionImplimentation  implements Exception
{
	@Override
	public void arithematicException(int value1, int value2) {
		try
		{
			int c=value1/value2;
			System.out.println(c);
		}
		catch( ArithmeticException e)
		{
			System.out.println("Arithematic exception");
		}
	}

	@Override
	public void indexOutOfBoundException(int[] array) {
		try
		{
			for(int index=0;index<=array.length-1;index++)
			{
				System.out.println(array[array.length]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index out of bound exception ");
		}
	}
	public static void main(String[] args)
	{
		ExceptionImplimentation result=new ExceptionImplimentation();
		result.arithematicException(12, 4);
		result.indexOutOfBoundException(new int[] {1,2,3,4,5});
		
	}
	

}
