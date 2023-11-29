package Opps;

import java.io.IOException;

public class Audi extends Vehicle {
	public Audi cost() {
		System.out.println("cost 2000");
		return new Audi();
	}
	
	public Audi()  {
		System.out.println("Audi");
	}
	public Audi  color()   {
		//int value=10/0;
		System.out.println("red") ;
	return null;
	}
}
