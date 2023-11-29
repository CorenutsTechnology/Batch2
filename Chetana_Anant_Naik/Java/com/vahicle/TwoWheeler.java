package com.vahicle;

public class TwoWheeler extends Vahicle {
	
	public void vahicle(String name, int cost) {
		System.out.println("vahicle name "+name+" cost "+cost);
		
	}

	@Override
	public void vahicle(String name, int cost, Object object) {
		System.out.println("vahicle name "+name+" cost "+cost+" "+object);
		
	}
}
