package com.crnts.operators;

public class UnaryOperator {
	public int preIncrement(int value1,int value2)
	   {
		   int result=(++value1 + value2);
		  
		   return result;
	   }
	 public int postIncrement(int value1,int value2)
	   {
		   int result=(value1++ +value2);
		   return result ;
	   }
	 public int preDecrement(int value1,int value2)
	   {
		   int result=(--value1 +value2);
		   return result ;
	   }
	 public int postDecrement(int value1,int value2)
	   {
		   int result=(value1-- +value2);
		   return result ;
	   }
}
