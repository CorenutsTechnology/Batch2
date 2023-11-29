package Assignments;

public class PrimeNumUsingRForLoop {

	public static void main(String[] args) {
		for(int index1=1;index1<=100;index1++) {
			int fact=0;
			for(int index2=1;index2<=index1;index2++) {
				if(index1%index2==0) {
					fact++;
				}
			}
			if(fact!=2) {
				System.out.println(index1);
			}
		}

	}

}
