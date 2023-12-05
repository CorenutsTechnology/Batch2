package com.cnts.throwthrows_20;

public class NestedTry {
	
	public void nestedTryStatements() {
		int arr[]= {1,3,5};
		try {
			for(int index=0;index<=2;index++) {
				System.out.println(arr[index]);
			}
			try {
				int divide=10/0;
				
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}
		
		
	}
	public static void main(String[] args) {
		NestedTry nestedTry = new NestedTry();
		nestedTry.nestedTryStatements();
		
		 
	}

}
