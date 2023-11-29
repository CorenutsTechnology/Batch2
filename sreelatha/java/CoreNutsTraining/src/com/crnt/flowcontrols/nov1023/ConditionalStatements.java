package com.crnt.flowcontrols.nov1023;

public class ConditionalStatements {

	
	public boolean ifStatements(int value1 , int value2)
	{
		if(value1<value2 && value1>value2)
				
		{
			System.out.println("if statement success");
			
		}
		else if (value1<value2 || value1>value2)
		{
			System.out.println("else if statement success");
		}
		else
		{
			System.out.println("else statement success");
		}
		return false;
		
	}
//	EnumClass cities = new EnumClass();
//	public EnumClass switchStatement(EnumClass cities)
//	{
//		switch(cities)
//		{
//		case "DOKIPARRU": System.out.println("dokiparru..");
//		case "VIJAYAWADA":System.out.println("vijayawada..");
//		case "HYDERABAD":System.out.println("Hyderabad...");
//		case "BANGLORE":System.out.println("bangloree...");
//		}
//		return cities;
//	}

}
