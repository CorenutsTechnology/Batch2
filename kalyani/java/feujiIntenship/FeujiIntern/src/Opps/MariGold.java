package Opps;

public class MariGold  extends Flower{

	public static void main(String[] args) {
		MariGold mariGold=new MariGold();
		mariGold.color();
		mariGold.petals();
		mariGold.rose();
		
	}
	public void petals() throws  ArithmeticException {
		System.out.println("petals");
		int value=10/0;
	}
	public void color()  {
		System.out.println("color");
	}
}

