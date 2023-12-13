package com.org.constructors22;

public class Parent extends GrandParent{
	private int age;
	private String name;
	private Parent parent;
	public Parent()
	{
	System.out.println("no arg of parent");	
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
	public void setParent(Parent parent)
	{
		this.parent=parent;
	}
	public Parent getParent()
	{
		return parent;
	}
	public Parent(String name,Parent parent)
	{
		this.name=name;
		this.parent=parent;
		System.out.println("Parent 2-arg1");
	}
	Parent(String name)
	{
		this.name=name;
		System.out.println("parent 2-arg cnst2");
	}

}
