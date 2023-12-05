package com.crnts.Generics;

import java.util.ArrayList;

public class BoundedParameterClass {
	//upper bound
	public <T extends Comparable> void compare(T value1,T value2)
	{
		System.out.println(value1.equals(value2));
	}
	
	public void display(ArrayList <? extends Comparable>list)
	{
		 
		for( Object obj:list)
		{
			System.out.println(obj);
		}
	
}
	public static void main(String[] args) {
		BoundedParameterClass boundedParameterClass =new BoundedParameterClass();
		ArrayList<String> stringList=new ArrayList<>();
		stringList.add("Hyd");
		stringList.add("Delhi");
		stringList.add("Sikkim");
		boundedParameterClass.display(stringList);
	}
}
