package day_20_11_23_Assignment;

public class Q3_voter  extends Exception{
	
	public static void main(String[] args) {
		Q3_voter vote =new Q3_voter();
		try {
			vote.age(10);
			System.out.println("not eligible for vote");
		} catch (Exception e) {
			System.out.println("but eligible for vote");
		}
	}
	
	public void age(int age) throws Exception {
		try {
			card(false);
			System.out.println("person have voter card ");
		} catch (Exception e) {
			System.out.println("person don't have voter card");
			if(age>18) {
				throw new Exception();
			}
		}
	}
	
	public void card(boolean card) throws Exception {
		if(card!=true) {
			throw new Exception();
		}
	}
}
