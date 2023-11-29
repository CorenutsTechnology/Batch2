package Opps;

import java.io.IOException;

public class Rose extends Flower {

	public static void main(String[] args) throws IOException {
		Rose rose=new Rose();
		rose.color();
		rose.petals();
	}
		public void color() {
			System.out.println("color");
		}
		public void petals()  throws IOException{ //Exception IoException is not compatible throws class
			System.out.println("good petals");
		}
}




