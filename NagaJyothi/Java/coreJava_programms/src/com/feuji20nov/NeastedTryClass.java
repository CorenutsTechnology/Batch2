package com.feuji20nov;

public class NeastedTryClass implements NestedTry
{
	@Override
	public void nestedTry(int value1, int value2, int[] arr) 
	{
		try
		{
			int value3=value1/value2;
			System.out.println("value3"+value3);
			try
			{
				System.out.println(arr[10]);
			}
			finally {
				System.out.println("finally block executed");
			}
		}
		catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
			System.out.println("all exception are handled....");
		}
		
		
	}
	public static void main(String[] args) 
	{
		NeastedTryClass result=new NeastedTryClass();
		result.nestedTry(10, 10, new int[] {1,2,3,4});
		
	}
	

}
