package com.org.oop21;

public class Parent extends Man {
	@Override
public Object job()
{
	System.out.println("parent job");
	return new Parent();
}

}
