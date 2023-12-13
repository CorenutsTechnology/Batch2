package oops_21_11;

public class Vehicle {

	public void steering() {
		System.out.println("Default");
	}
	
	public String steering(String str)
	{
		return str;
	}
	
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.steering();
		System.out.println(vehicle.steering("hello"));
		
	}
}
