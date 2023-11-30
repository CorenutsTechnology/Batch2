package day_10_11_23_Assignment;

public class BreakKeyword {

	public void printNumbers() {
		for(int index=1;index<=100;index++) {
			if(index==47) {
				break;
			}
			System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		BreakKeyword breakKeyword=new BreakKeyword();
		breakKeyword.printNumbers();
	}

}
