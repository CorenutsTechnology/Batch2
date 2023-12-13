package com.feuji29nov;

public class GenericClass <T>
{
	private T name;
	private T age;
	private T add;
	
	public GenericClass()
	{
		
	}
	public T getName() {
		return name;
	}


	public void setName(T name) {
		this.name = name;
	}


	public T getAge() {
		return age;
	}


	public void setAge(T age) {
		this.age = age;
	}


	public T getAdd() {
		return add;
	}


	public void setAdd(T add) {
		this.add = add;
	}


	public GenericClass(T name, T age, T add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}


	public static void main(String[] args) 
	{
		GenericClass<String> result=new GenericClass<>("jyothi","ten","tweenty");
		result.setAge("10");
				
	}

}
