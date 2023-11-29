package com.cnts.nov9Operaters;

public class LogicalOperators
{
		public boolean andOperator(int value1, int value2)
		{
			boolean result=((value2<value1) && (value1>1000));
			return result;
		}
		
		public boolean orOperator(int value1, int value2)
		{
			boolean result=((value2<value1) || (value1>100));
			return result;
		}
		
		public static void main(String[] args) {
			 
			LogicalOperators logicalOperators = new LogicalOperators();
			System.out.println(logicalOperators.andOperator(182,292));
			System.out.println(logicalOperators.orOperator(612, 126));
		}	
}
