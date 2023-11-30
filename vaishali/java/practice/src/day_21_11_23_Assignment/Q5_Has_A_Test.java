package day_21_11_23_Assignment;

public class Q5_Has_A_Test {

	public static void main(String[] args) {
		
		Q5_Car car=new Q5_Car("RollsRoyece",3200 , new Q5_Engine("RR", 26000));
		
		System.out.println("car brand: "+car.brand);
		System.out.println("car ts: "+car.ts);
		System.out.println("engine brand: "+car.engine.brand);
		System.out.println("engine hp: "+car.engine.hp);
	}

}
