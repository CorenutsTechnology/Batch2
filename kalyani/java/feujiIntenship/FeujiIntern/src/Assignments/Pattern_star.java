package Assignments;

public class Pattern_star {

	public static void main(String[] args) {
		int star=10;
		int space=0;
		for(int index=1;index<10;index++) {
			for(int index1=1;index1<space;index1++) {
				System.out.print("");
			}
			for(int index1=1;index1<star;index1++) {
				System.out.print("*");
			}
			
			System.out.println();
			star--;
			space++;
		}

	}

}
