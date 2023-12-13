package com.org.constructor23;

public class Flower {
 String name;
 String color;
public Flower()
{
	System.out.println("flower no arg constructor");
	
}
public Flower(String name)
{
	this();
	this.name=name;
}

}
