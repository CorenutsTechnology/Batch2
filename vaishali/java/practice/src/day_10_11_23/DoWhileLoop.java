package day_10_11_23;

public class DoWhileLoop {

	public void doWhileBreak() {
		boolean flag=true;
		int i=0;
		while(flag) {
			System.out.println("loop "+i);
			int j=0;
			do {
				if(i==6) {
					System.out.println("6th iteration");
					break;
				}
				i++;
			} while (j++ <10);
			flag=(i++<=10);
		}
	}
	public void doWhileContinue() {
		boolean flag=true;
		int i=0;
		while(flag) {
			System.out.println("loop "+i);
			int j=0;
			do {
				if(i==6) {
					System.out.println("6th iteration");
					continue;
				}
				i++;
			} while (j++ <10);
			flag=(i++<=10);
		}
	}
	public static void main(String[] args) {
		DoWhileLoop loop=new DoWhileLoop();
		 
		System.out.println("using break : ");
		loop.doWhileBreak();
		
		System.out.println("using continue : ");
		loop.doWhileContinue();
	}

	
}
