package day_23_11_23_Assignment;

public class Q2_Car extends Q2_Vehicle{

	int wheels; 
	Q2_Car car;
	
	public Q2_Car() {
//		super();
		System.out.println("car constructor without arguments");
	}

	public Q2_Car(int wheels) {
		super("car");
//		super();
		System.out.println(super.type);
		System.out.println(this.wheels);
		System.out.println("car constructor with one argument");
	}

	public Q2_Car(int wheels, Q2_Car car) {
//		super();
		this();
		this.wheels = wheels;
		this.car = car;
		System.out.println("car constructor with two arguments");
	}
	
	
	
}
