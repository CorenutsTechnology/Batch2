package com.cnts.exceptions_17;

public class MultilpleCatchBlock {
	public static void main(String[] args) {
		try {
			int result = 10/5;
			System.out.println(result);
			int[] arr= {1,3,5};
			for(int index=0;index<=3;index++) {
				System.out.println(arr[index]);	
		}	
	}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index out of bound exception "+e1.getMessage());
			e1.printStackTrace();
			
		}
	
	

}
}
