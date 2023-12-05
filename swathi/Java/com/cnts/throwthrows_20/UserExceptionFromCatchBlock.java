package com.cnts.throwthrows_20;

public class UserExceptionFromCatchBlock {
	
	public void divide(int value1,int value2)  {
		try {
			int result=value1/value2;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			try {
				if (value2==0) {
					throw new CustomException("second value should be greater than zero");
				}else {
					System.out.println(value2);
					
				}
				
			}catch(CustomException e1) {
				System.out.println(e.getMessage());
			}
			
		
			
		}
	}
	public static void main(String[] args) {
		UserExceptionFromCatchBlock userExceptionFromCatchBlock = new UserExceptionFromCatchBlock();
		userExceptionFromCatchBlock.divide(10, 5);
		
		
	}

}
