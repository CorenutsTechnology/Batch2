package day_23_11_23_Assignment;

public class Q2_Vehicle {

	String type;
	Q2_Vehicle vehicle;
	
	public Q2_Vehicle() {
//		super();
		System.out.println("vehicle constructor without arguments");
	}

	public Q2_Vehicle(String type) {
//		super();
		this.type = type;
		System.out.println("vehicle constructor with one argument");
	}

	public Q2_Vehicle(String type, Q2_Vehicle vehicle) {
//		super();
		this.type = type;
		this.vehicle = vehicle;
		System.out.println("vehicle constructor with two arguments");
	}
	
	
}
