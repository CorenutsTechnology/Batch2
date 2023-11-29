package com.crnt.polymorphism.nov2123;

public class EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationClass encapsulationClass = new EncapsulationClass();
		encapsulationClass.setName("srilatha goriparthi");
	     encapsulationClass.setAge(23);
	     encapsulationClass.setCountry("india");
	     encapsulationClass.setAge(234);
	     encapsulationClass.setName("naga");
	     
	    System.out.println(encapsulationClass.getName()); 
	     System.out.println(encapsulationClass.getAge());
	    System.out.println(encapsulationClass.getCountry()); 
	}

}
