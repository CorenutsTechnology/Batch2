package Opps;

import java.io.IOException;


public class sunflower {

	public static void main(String[] args) {
		sunflower sunflower=new sunflower();
		sunflower.color();
		try {
			sunflower.petals();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void petals() throws IOException {
			System.out.println("petals");
		}
		public void color()  {
			System.out.println("color");
		}
	}


