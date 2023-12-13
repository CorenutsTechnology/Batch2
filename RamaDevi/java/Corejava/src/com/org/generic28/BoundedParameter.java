package com.org.generic28;

public class BoundedParameter <T extends BoundSuper>{
private T var;
public BoundedParameter(T var)
{
	this.var=var;
}
public void doTest()
{
	this.var.Method1();
}
}
