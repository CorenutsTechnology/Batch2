package com.org.MethodRef11;

public class Employee  {
String name;
int id;

public Employee()
{
	
}
public Employee(String name)
{
	this.name=name;
	System.out.println("name is:"+name);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 

}


