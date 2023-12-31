//2. Create generic classes and interfaces and then set the different kind of objects using generic type.

package com.generic.nov28;

public class GenericClass2<T>
{
	private T name;
	private T location;
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getLocation() {
		return location;
	}
	public void setLocation(T location) {
		this.location = location;
	}

	public static void main(String[] args) {
		GenericClass2<Integer> obj = new GenericClass2<Integer>();
		obj.setName(100);
		System.out.println(obj.getName());
		GenericClass2<String> obj2 = new GenericClass2<String>();
		obj2.setName("Rose");
		System.out.println(obj2.getName());
		if(obj.equals(obj2))
		{
			System.out.println("objects are equal");
		}
		else
			System.out.println("not equal");
	}
}
