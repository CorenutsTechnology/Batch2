package com.cnts.generics_28;

public class GenericClass<T> implements Comparable{
	
	public GenericClass(T name, T location) {
		super();
		this.name = name;
		this.location = location;
	}

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
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
