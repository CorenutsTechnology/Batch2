package com.crnt.polymorphism.nov2123;

public class OverloadFunctions {
	public void rectangle (int width)
	{
		System.out.println("the width of the rectangle is "+width);
	}
	public void rectangle (int length,String colour)
	{
		System.out.println("the length of the rectangle is "+length+" "
				+ "and the color"+colour);
	}
	public void rectangle (String texture)
	{
		System.out.println("the texture of the rectangle is "+texture);
	}
	public static void main(String[] args) {
		OverloadFunctions overloadFunctions= new OverloadFunctions();
		overloadFunctions.rectangle(5);
		overloadFunctions.rectangle(10,"blue");
		overloadFunctions.rectangle("plain");
		
		
	}
	
	

}
