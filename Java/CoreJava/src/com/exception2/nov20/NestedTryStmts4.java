//4. Write a Program that implement the Nested try Statements ?

package com.exception2.nov20;

public class NestedTryStmts4 
{
	public void tryMethod()
	{
		System.out.println("trying nested try methods...");
		try {
			try {
				int[] arr = new int[1];
				System.out.println(arr[arr.length]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			int result = 10/0;
			System.out.println("result: "+result);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) 
	{
		NestedTryStmts4 nestedTryStmts4 = new NestedTryStmts4();
		nestedTryStmts4.tryMethod();
	}
}
