package com.org.check;

import java.util.Objects;

public class Employee {
private String name;
private String location;
public Employee()
{
	
}
public Employee(String name)
{
	this.name=name;
}
public Employee(String name,String location)
{
	this.name=name;
	this.location=location;
}
public void setName(String name)
{
	this.name=name;
}
public String getName() {
	return name;
}
public void setLocation(String location)
{
	this.location=location;
}
public String getLocation() {
	return name;
}
public String toString()
{
	return "name"+this.name+", location"+this.location;
}
public int hashCode()
{
	return Objects.hash(name,location);
}
public boolean equals(Object obj)
{
	if(this==obj)
		return true;
	if(this==null)
		return false;
	if(getClass()!=obj.getClass())
		return false;
	Employee other=(Employee)obj;
	return Objects.equals(name,other.name)&&Objects.equals(location, other.location);
}
}
