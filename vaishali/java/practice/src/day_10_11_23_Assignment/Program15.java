package day_10_11_23_Assignment;

public class Program15 {

	public void table() {
		for (int row = 0; row <=10; row++) {
			for (int column = 0; column <=10; column++) {
				if(row==0 && column==0) {
					System.out.print("* ");
				}
				else if(row==1) {
					if(column>=1) {
						System.out.print("---");
					}
				}
				else if((row==0 && column==1)||column==1) {
					System.out.print("| ");
				}
				else if(row==0) {
					System.out.print((column-1)+" ");
				}
				else if(column==0) {
					System.out.print((row-1)+" ");
				}
				else if(column>=2 && row>=2){
					System.out.print((row-1)*(column-1)+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Program15 program=new Program15();
		program.table();
	}

}
