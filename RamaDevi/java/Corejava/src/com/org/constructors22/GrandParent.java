package com.org.constructors22;

public class GrandParent {
private int age;
private String name;
public GrandParent()
{
	System.out.println("GrandParent NoArg Constructor");
}
public GrandParent(int age)
{
	System.out.println("age of grandFather");
}
public GrandParent(String name,int age)
{
System.out.println("GrandParent 2-arg constructor");	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
