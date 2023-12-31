package com.exception_overriding.nov21;

public class Benz 
{
	Engine engine = new Engine();
	
	void display()
	{
		System.out.println("engine type: "+engine.type+" capacity: "+engine.capacity);
	}
}
