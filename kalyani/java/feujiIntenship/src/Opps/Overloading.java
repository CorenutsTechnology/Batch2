package Opps;

public class Overloading {

	public static void main(String[] args) {
		area(10, 5);
		area(5);
		area(3);
	}
	public static void area( int Length,int breadth) {
		System.out.println("Result"+breadth*Length);
	}
	public static void  area(int side) {
		System.out.println("Result"+side*side);
	}
	public static void area(double radius) {
		System.out.println("Result"+3.14*radius);
		
	}

}
