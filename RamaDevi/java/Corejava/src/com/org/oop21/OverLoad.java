package com.org.oop21;

public class OverLoad {
public void methodOverLoad()
{
	System.out.println("method without any arguments");
	
}
public void methodOverLoad(int value)
{
	System.out.println("method with  one arguments");
}
public void methodOverLoad(int value,String name)
{
	System.out.println("method with  two arguments");
}
	public static void main(String[] args) {
		OverLoad  overload=new OverLoad();
		overload.methodOverLoad();
		overload.methodOverLoad(10);
		overload.methodOverLoad(20,"ram");

	}

}
