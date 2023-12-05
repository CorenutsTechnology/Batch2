package com.cnts.oops_21;

public class Rose extends Flower{
	
	public void petals()throws RuntimeException {
		System.out.println("Rose has minimum ten petals");
		int divide=10/0;
		
	}
	
	public static void main(String[] args) {
		Rose rose=new Rose();
		try {
			rose.petals();
			
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
