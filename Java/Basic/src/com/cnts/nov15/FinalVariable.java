package com.cnts.nov15;

public class FinalVariable
{
	final int variable = 12;    // we cant reinitialize the final variabl 
//	int variable =13;
	
	public void display()
	{
		final String name = "Anisha";
//		final String name = "Rani";              // it gives duplicat variabl name
	}
	
	/* 
	 * SwitchWeekDay day = new SwitchWeekDay();
		day.variable=13; 
	 * 
	 * we cant re initialize the final variable in another class also
	 * */
}
