package day_10_11_23_Assignment;

public class Program14 {
	
	public void patten(String name) {
		for (int row = 0; row < name.length(); row++) {
			for (int column = 0; column <=row; column++) {
				System.out.print(name.charAt(column));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Program14 program=new Program14();
		program.patten("corenuts");
	}
}
