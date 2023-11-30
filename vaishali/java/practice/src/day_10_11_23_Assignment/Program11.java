package day_10_11_23_Assignment;

public class Program11 {

	public void pattern() {
		for (int row = 1; row <=5; row++) {
			for (int column = 1; column <=5; column++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Program11 program=new Program11();
		program.pattern();
	}

}
