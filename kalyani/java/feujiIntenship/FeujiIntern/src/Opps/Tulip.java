package Opps;

import java.io.IOException;

public class Tulip extends  Flower {

	public static void main(String[] args) {
		Tulip tulip=new Tulip();
		tulip.color();
		tulip.petals();
		tulip.rose();

	}
	public void petals()   {
		System.out.println("petals");
	}
	public void color() {
		System.out.println("color");
	}

}
