package com.feuji28nov;

public class Genaric <T>
{
	//make class as a genaric
	public Genaric()
	{
		
	}
	private  T id;
	private  T name;
	private T location;
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
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
	

}
