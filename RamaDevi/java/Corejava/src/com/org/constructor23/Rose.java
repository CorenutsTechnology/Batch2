package com.org.constructor23;

public class Rose extends Flower{
String color;
public Rose() {
	super();
	System.out.println("default Rose");
}
public Rose(String color)
{
	this();
this.color=color;
System.out.println("color is"+color);
}


}
