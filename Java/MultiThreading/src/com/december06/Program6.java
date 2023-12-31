//6. Write a program to show the behavior of synchronized function and non-synchronized function.
package com.december06;

public class Program6 
{
	public static void main(String[] args) 
	{
		Thread6 thread6 = new Thread6();
		new Thread(thread6,"thread-1").start();
		new Thread(thread6,"thread-2").start();
		
	}
}
