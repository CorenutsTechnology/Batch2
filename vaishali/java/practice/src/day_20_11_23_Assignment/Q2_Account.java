package day_20_11_23_Assignment;

public class Q2_Account extends Exception{
	
	public void checkBalance(int balance) throws Exception {
		if(balance<1000) {
			throw new Exception();
		}
	}
}
