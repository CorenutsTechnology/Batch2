package com.crnts.operators;

public class LogicalOperators {
   public boolean logicalAnd(int value1,int value2)
   {
	   boolean result=((value1>value2)&& value1==10);
	   return result ;
   }
   public boolean logicalOr(int value1,int value2)
   {
	   boolean result=((value1>value2)||value2==10);
	   return result ;
   }
   public boolean logicalNot(int value1,int value2)
   {
	   boolean result=!((value1>value2)||value1==10);
	   return result ;
   }
}
