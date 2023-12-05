package com.crnts.operators;

public class ArithmeticOperations {
   public int addition(int value1,int value2)
   {
	   int result=value1+value2;
	   System.out.println("addition"+result);
	   return result;
   }
   public int subtraction(int value1,int value2)
   {
	   int result=value1-value2;
	   System.out.println("subtraction"+result);
	   return result;
   }
   
   public int multiplication(int value1,int value2)
   {
	   int result=value1*value2;
	   System.out.println("multiplication"+result);
	   return result;
   }
   public int division(int value1,int value2)
   {
	   int result=value1/value2;
	   System.out.println("division"+result);
	   return result;
   }
   public int modulus(int value1,int value2)
   {
	   int result=value1%value2;
	   System.out.println("modulus"+result);
	   return result;
   }
}
