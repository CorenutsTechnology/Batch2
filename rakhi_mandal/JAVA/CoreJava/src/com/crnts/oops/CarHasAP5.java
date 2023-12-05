package com.crnts.oops;

public class CarHasAP5 {
	
	String numberPlate; //="KA90012";
	String name;  //="Thar";
	EngineHasAP5 engineHasAP5;  //= new EngineHasAP5(); //HAS A RELATION
	
	
	public CarHasAP5(String numberPlate, String name, EngineHasAP5 engineHasAP5) {
		super();
		this.numberPlate = numberPlate;
		this.name = name;
		this.engineHasAP5 = engineHasAP5;
	}
	static  CarHasAP5 carHasAP5 =new CarHasAP5("KA90012","Thar",(new EngineHasAP5(353535,"Mahindra",78787)));
	
	
	  public static void main(String[] args) { 
		 carHasAP5.display();
	  }
	  void display()
	  {
//		  System.out.println(carHasAP5.numberPlate);
//		  System.out.println(carHasAP5.name);
//		  System.out.println(carHasAP5.engineHasAP5.brand);
//-------------------------------------------------------------------------------------
		  
		  System.out.println("Engine brand is: "+carHasAP5.engineHasAP5.brand);
		  System.out.println("Engine brand Id is: "+carHasAP5.engineHasAP5.engineId);
		  System.out.println("Car number plate is: "+carHasAP5.numberPlate);
		    
	  }
	 
}
