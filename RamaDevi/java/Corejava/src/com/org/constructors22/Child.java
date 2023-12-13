package com.org.constructors22;

public class Child {
private int age;
private String name;
private Parent parent;
public Child()
{
	System.out.println("child no arg construct");
}
public Child(int age)
{
	this.age=age;
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
	public static void main(String[] args) {
		Child child=new Child(20);
		System.out.println(child.getAge());
		child.setName("ram");
		System.out.println(child.getName());
		
		Parent parent=new Parent("ramu",new Parent());
		System.out.println(parent.getParent());
		System.out.println(parent.getName());
		

	}

}
