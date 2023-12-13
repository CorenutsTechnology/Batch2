package com.org.operators09;

public class UnaryOperator {

public void  preIncrement(int value)
{
	++value;
	System.out.println(value);
}
public void  postIncrement(int value)
{
	value++;
	System.out.println(value);
}
public void  preDecrement(int value)
{
	--value;
	System.out.println(value);
}
public void  postDecrement(int value)
{
	value--;
	System.out.println(value);
}
}
