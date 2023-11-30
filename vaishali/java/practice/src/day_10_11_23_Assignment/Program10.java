package day_10_11_23_Assignment;

public class Program10 {

	public void pattern() {
		for (int row = 1; row <=5; row++) {
			if(row==2) {
				continue;
			}
			for (int column = 1; column <=row; column++) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Program10 program=new Program10();
		program.pattern();
	}

}
