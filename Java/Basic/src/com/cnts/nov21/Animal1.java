package com.cnts.nov21;

public class Animal1 
{
	private String name;
	
    void eat()
	{
		System.out.println("Animals eat");
	}
	
	public void speak()
	{
		System.out.println("Animal is speaking");
	}
	
	public Animal1(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal1  method1()
	{
		return null;
	}
	
	public void method2(Animal1 animal)
	{
		
	}
	
	public Animal1 method3(Dog1 animal)
	{
		return null;
	}
	
//	public Animal1 method3(Animal1 animal)
//	{
//		return null;
//	}
	
	public Dog1 method3(Animal1 animal)
	{
		return null;
	}
	
	
}


