//3. Overload functions (static polymorphism) in a class and access them using the class
//object. And also show the advantage of using overloading concept.

package com.exception_overriding.nov21;

public class Overload3 
{
	public void calculate(int value1 , int value2)
	{
		System.out.println("sum: "+(value1+value2));

	}
	public void calculate(int value1 , int value2,int value3)
	{
		System.out.println("sum: "+(value1+value2+value3));
	}
	public static void main(String[] args) 
	{
		Overload3 overload3 = new Overload3();
		overload3.calculate(10,20);
		overload3.calculate(10,20,30);
		
	}

}
