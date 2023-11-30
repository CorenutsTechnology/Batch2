package day_17_11_23_Assignment;

public class Q2_ArithmeticException {

	public static void main(String[] args) {
		
		try {
			int value=10/0;
			System.out.println(value);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception : "+e.getMessage());
		}
		
	}

}
