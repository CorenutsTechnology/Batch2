package com.crnts.oops;

public class EngineHasAP5 {
	 long engineId;// =70880;
     String brand; //="Mahindra";
     int horsePower;
     
     
     public EngineHasAP5(long engineId, String brand, int horsePower) {
		super();
		this.engineId = engineId;
		this.brand = brand;
		this.horsePower = horsePower;
	}


	void performance()
     {
    	 System.out.println("Good performance");
     }
}
