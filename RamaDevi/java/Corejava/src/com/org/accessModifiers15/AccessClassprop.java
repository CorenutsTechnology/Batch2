package com.org.accessModifiers15;

public class AccessClassprop {
public int publicValue1=10;
private int privateValue2=20;
int defaultValue=30;
protected int protectedValue=40;

public void publicMethod()
{
	System.out.println("public Method");
}
private void privateMethod()
{
	System.out.println("private Method");
}
protected void protectedMethod()
{
	System.out.println("protected Method");
}
void defaultMethod()
{
	System.out.println("default Method");
}
}
