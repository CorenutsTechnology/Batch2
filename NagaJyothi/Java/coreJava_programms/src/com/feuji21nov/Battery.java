package com.feuji21nov;

public class Battery 
{
	 private int capacity;
	 

	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCapacity() {
		return capacity;
	}
	

	public Battery(int capacity) {
		super();
		this.capacity = capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println(capacity);
	}

	@Override
	public String toString() {
		return "Battery [capacity=" + capacity + "]";
	}
	 
	

}
