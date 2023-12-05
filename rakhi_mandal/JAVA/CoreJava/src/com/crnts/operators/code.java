package com.crnts.operators;

public class code {
	public static void main(String[] args) {
		 int value1=10;
		  int value2=20;
		  int value3=30;
		  if((value1>20)&&value2++>10)
			{
			  System.out.println(value2);
			}
		  else
			  System.out.println(value2);  //after checking condition one controller directly comes to else block.
		  
		  if((value1>20)&value3++>10)
				{
				  System.out.println(value3); //controller checks both conditions and value3 is incremented.
				  
				}
			  else
				  System.out.println(value3);
	}
 
}

