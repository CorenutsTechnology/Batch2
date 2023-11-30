package day_23_11_23_Assignment;

public class Q2_ConstructorChaining {

	public static void main(String[] args) {
		System.out.println("START");
		
		Q2_Car car=new Q2_Car(2);
		
		car=new Q2_Car(3, car);
		
		System.out.println("END");
		
		
	}

}
