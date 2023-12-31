package com.december05;

public class MainClass2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadTwo());
		thread.start();
		Thread.yield();
		for(int i=0;i<10;i++)
		{
			System.out.println("main: "+i);
		}
	}
}
