package day_20_11_23_Assignment;

public class Q2_UserDefined_try {

	public static void main(String[] args) {
		int balance=500;
		try {
			if(balance<1000) {
				throw new Exception();
			}
			System.out.println("sufficient balance");
		} catch (Exception e) {
			System.out.println("insufficient balance");
		}
	}

	
}
