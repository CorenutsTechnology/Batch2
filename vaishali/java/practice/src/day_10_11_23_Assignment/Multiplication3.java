package day_10_11_23_Assignment;

public class Multiplication3 {

	public void forLoop(int number) {
		for(int index=1;index<10;index++) {
			int result=number*index;
			if(result%2==1) {
				System.out.println(result);
			}
		}
	}
	
	public void whileLoop(int number) {
		int value=1;
		while(value<=10) {
			int result=number*value;
			if(result%2==1) {
				System.out.println(result);
			}
			value++;
		}
	}
	
	public void DoWhileLoop(int number) {
		int value=1;
		do {
			int result=number*value;
			if(result%2==1) {
				System.out.println(result);
			}
			value++;
		} while (value<=10);
	}
	
	public static void main(String[] args) {
		Multiplication3 multiplication=new Multiplication3();
		
		System.out.println("USING FOR LOOP");
		multiplication.forLoop(3);
		
		System.out.println("USING WHILE LOOP");
		multiplication.whileLoop(3);
		
		System.out.println("USING DOWHILE LOOP");
		multiplication.DoWhileLoop(3);
	}

}
