//3. Declare generic methods, but class is not generic. Access the generic method by providing generic type.

package com.generic.nov28;

public class GenericMethod3
{
	public <T> void compare(T value1 , T value2)
	{
		System.out.println("inside compare method");
		System.out.println(value1.equals(value2));
	}
	public static void main(String[] args) 
	{
		GenericMethod3 obj1 = new GenericMethod3();
		obj1.compare(10,"hello");
		obj1.<String>compare("hello","hii");
		obj1.<GenericClass1>compare(new GenericClass1(),new GenericClass1());
		
	}

}
