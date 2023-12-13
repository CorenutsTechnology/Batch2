package com.feuji21nov;
class FristClass
{
	public  int grandAge=90;
	public void grandParents()
	{
		System.out.println("grand parents property");
		System.out.println("Age:"+grandAge);
	}
}
class SecondClass extends FristClass
{
	public int parentsAge=40;
	public void parents()
	{
		System.out.println("parents property");
		System.out.println("Age of parents:"+parentsAge);
	}
}
public class MultiLevelInheritance extends SecondClass
{
	int age=20;
	public void property()
	{
		System.out.println("my age:"+age);
		System.out.println("my property");
	}
	public static void main(String[] args) 
	{
		MultiLevelInheritance result=new MultiLevelInheritance();
		System.out.println(result.grandAge);
		System.out.println(result.parentsAge);
		System.out.println(result.age);
		result.grandParents();
		result.parents();
		result.property();
		
	}

}
