package day_10_11_23_Assignment;

public class Program13 {

	public void pattern() {
		int star=10;
		for (int row = 1; row <=8; row++) {
			for (int column = 1; column <=star; column++) {
				System.out.print("*");
			}
			System.out.println();
			if(star>6 && star%2==0) {
				star-=2;
			}
			else {
				star--;
			}
		}
	}
	
	public static void main(String[] args) {
		Program13 program=new Program13();
		program.pattern();
	}

}
