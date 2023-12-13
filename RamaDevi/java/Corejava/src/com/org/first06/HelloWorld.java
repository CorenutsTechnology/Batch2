package com.org.first06;

public class HelloWorld {
int num=10;
static String name="luckky";
	public static void main(String[] args) {
		int num=30;
		String name="rama";
		System.out.println("hello");
    	System.out.println(name);
		System.out.println(num);
		
		HelloWorld helloworld=new HelloWorld();
		System.out.println(helloworld.num);
		System.out.println(helloworld.name);
		//System.out.println(HelloWorld.num);
		System.out.println(HelloWorld.name);
	}

}
