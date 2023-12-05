package com.cnts.oops_21;

import java.io.IOException;
import java.sql.SQLException;

public class Jasmine extends Flower {
	
//	
public void speed()throws IOException{
	
}
	
	public void petals() throws RuntimeException{
		System.out.println("Flower has minimum two  petals");
}
	
//	public void petals() throws ArithmeticException{
//		System.out.println("Flower has minimum two  petals");
//	} 
//	public void petals() {
//		System.out.println("Flower has minimum two  petals");
//	}
	public static void main(String[] args) {
		Jasmine  jasmine = new Jasmine();
		jasmine.petals();
		//jasmine.speed();
		
	}
	
	

}
