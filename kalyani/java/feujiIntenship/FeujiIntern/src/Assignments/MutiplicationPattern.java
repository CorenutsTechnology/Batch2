package Assignments;

public class MutiplicationPattern {

	public static void main(String[] args) {
		int result=0;
		for(int index=1;index<=9;index++) {
			for(int index1=1;index1<=9;index1++) {
				result=index*index1;
				System.out.print("  "+result++);
			}
			System.out.println();
		}

	}

}
