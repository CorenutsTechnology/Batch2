package com.december06;

public class Program6b 
{
	public static void main(String[] args) 
	{
		Thread6b thread6b = new Thread6b();
		new Thread(thread6b,"thread-1").start();
		new Thread(thread6b,"thread-2").start();
		
	}
}
