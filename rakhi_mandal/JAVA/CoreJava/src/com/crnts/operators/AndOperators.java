//09/11/23
package com.crnts.operators;

public class AndOperators {
	 public boolean And(int value1,int value2)
	   {
		   boolean result=((value1<value2)& value1==15);
		   return result ;
	   }
	 public boolean And1(int value1,int value2)
	   {
		   boolean result=((value1>value2)&& value1==15);
		   return result ;
	   }

}
