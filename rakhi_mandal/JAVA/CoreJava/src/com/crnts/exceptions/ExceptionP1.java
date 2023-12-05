//P1,P2,P3,P4 HERE
package com.crnts.exceptions;

public class ExceptionP1 implements P1Exception {
     public static void main(String[] args) {
    	 ExceptionP1 exceptionP1=new ExceptionP1();
    	 exceptionP1.handleException();
//    	 exceptionP1.arithmeticException();
//    	 exceptionP1.handleExceptionP3();
//    	 exceptionP1.finallyWithoutCatchP4();
	}
 	@Override
	public  void handleException()
	{
		int[] array={9,4,3};
		try{for(int index=0;index<=array.length;index++)
		{
			System.out.println(array[index]);
		}
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception handled");
//		e.printStackTrace();
	}
	}


	@Override
	public void arithmeticException() {
		int value1=7;
		try {
			int result =value1/0;
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		
	}
	public  void handleExceptionP3()
	{
		
		try{String name=null;
			System.out.println(name.length());
		
	}catch(NullPointerException e)
	{
		System.out.println("Exception handled");
//		e.printStackTrace();
	}
		finally {
			System.out.println("Finally bolck executed for program 3");
			
		}
				
	}
	public  void finallyWithoutCatchP4()
	{
		try{String state= null;
		System.out.println(state.charAt(2));
	
}
	finally {
		System.out.println("Finally bolck executed without catch for program 4");
	}
	}

}
