package com.org.exception17;

public class MultipleCatch {
	int intValue=50;
public void exeception()
{
	System.out.println("start");
	try
	{
		int number=30;
	String name=null;
	System.out.println(name.charAt(0));
	int result=number/0;
	System.out.println("result"+result);
	int[] array= {4,2,5};
	System.out.println(array[5]);
	}
	catch (NullPointerException e) {
		System.out.println("nullpointer exception");
	}
	catch (ArithmeticException e) {
		System.out.println("arithematic exception");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("classnotfound exception");
	}
	System.out.println("end");
	
}
	public static void main(String[] args) {
		MultipleCatch multiplecatch=new MultipleCatch();
		multiplecatch.exeception();
		
	}

}
