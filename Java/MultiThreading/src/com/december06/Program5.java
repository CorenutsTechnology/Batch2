//5. Write a program to display 1 to 100 values while executing thread job in slow face.

package com.december06;

public class Program5
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("main method is started");
		for(int index=1;index<=100;index++)
		{
			System.out.println(index);
			Thread.sleep(100);
		}
		System.out.println("main method is ended");

	}
}
