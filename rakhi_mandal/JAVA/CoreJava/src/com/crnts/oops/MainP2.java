package com.crnts.oops;

public class MainP2 implements AbstractionP2 {

	public static void main(String[] args) {
		
//------Encapsulation---------------------------------------
//		EncapsulationP2 encapsulationP2=new EncapsulationP2();
//		encapsulationP2.setId(2);
//		encapsulationP2.setName("rakhi");
//		
//		System.out.println(encapsulationP2.getId());
//		System.out.println(encapsulationP2.getName());
		
		
//------Inheritance-----------------------------------------
		MainP2 mainP2=new MainP2();
				
		mainP2.display();
	}

	@Override
	public void display() {
      System.out.println("Abstraction shows the  functionality with hiding the implementation");		
	}

}
