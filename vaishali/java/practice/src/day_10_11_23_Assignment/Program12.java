package day_10_11_23_Assignment;

public class Program12 {

	public void pattern() {
		for (int row = 1; row <=7; row++) {
			for (int column = 1; column <=7; column++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Program12 program=new Program12();
		program.pattern();
	}

}
