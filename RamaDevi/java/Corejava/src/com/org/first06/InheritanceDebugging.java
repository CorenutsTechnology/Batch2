package com.org.first06;
class First
{
	static int v1=10;
	public static void method1()
	{
		System.out.println("value:"+v1);
	}
	
}
class Second extends First
{
	static int v2=20;
	public static void method2()
	{
		method1();
		System.out.println(v2);
		System.out.println(First.v1);
	}
	
	
}
public class InheritanceDebugging {

	public static void main(String[] args) {
		Second second=new Second();
		second.method1();
		second.method2();

	}

}
