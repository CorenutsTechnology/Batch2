package day_10_11_23_Assignment;

public class NonPrime {

	public void forLoop() {
		for(int index=1;index<=100;index++) {
			int count=0;
			for(int index1=2;index1<=index/2;index1++) {
				if(index%index1==0) { 
					count++;
				}
			}
			if(count!=0 || index==1) {
				System.out.print(index+" ");
			}
		}
	}
	
	public void whileLoop() {
		int number=1;
		while(number<=100) {
			int count=0;
			int value=2;
			while(value<=number/2) {
				if(number%value==0) {
					count++;
				}
				value++;
			}
			if(count!=0 ||number==1) {
				System.out.print(number+" ");
			}
			number++;
		}
	}
	
	public void doWhileLoop() {
		int number=1;
		do {
			int value=2;
			int count=0;
			do {
				if(number%value==0) {
					count++;
				}
				value++;
			} while (value<=number/2);
			if((count!=0 && number!=2)|| number==1) {
				System.out.print(number+" ");
			}
			number++;
		} while (number<=100);
		
		
	}
	
	public static void main(String[] args) {
		NonPrime nonPrime=new NonPrime();
		
		System.out.println("USING FOR LOOP");
		nonPrime.forLoop();
		
		System.out.println();
		System.out.println("USING WHILE LOOP");
		nonPrime.whileLoop();
		
		System.out.println();
		System.out.println("USING DOWHILE LOOP");
		nonPrime.doWhileLoop();
	}

}
