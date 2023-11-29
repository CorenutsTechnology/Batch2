package Opps;

public class Jasmine extends Flower {

	public static void main(String[] args) {
		Jasmine jasmine=new Jasmine();
		jasmine.color();
		try {
		jasmine.petals();
		}
		catch(ArithmeticException e) {
			
		}
		jasmine.rose();
	}
		public void petals() throws ArithmeticException {
			System.out.println("good petals");
			int value=10/0;
		}
		public void color() {
			System.out.println("color");
		}

	}


