package com.crnt.test.nov;

import Interface_Collection.IS_A_ANA_HAS_A_Realation;

public class Vahicle implements IS_A_ANA_HAS_A_Realation{

	@Override
	public void vahicle() {
		System.out.println("vahicle");
		
	}

	@Override
	public void vahicle(String name) {
		
		System.out.println("vahicle name "+name);
	}

	@Override
	public void vahicle(int cost) {
		System.out.println("vahicle cost " +cost);
	}

	@Override
	public void vahicle(String name, int cost) {
		System.out.println("vahicle name "+name+" cost "+cost);
		
	}

	@Override
	public void vahicle(String name, int cost, Object object) {
		System.out.println("vahicle name "+name+" cost "+cost+" "+object);
		
	}
	 
	
	

	
	

}
