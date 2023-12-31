package com.interfaceandabstract.nov16;

public class Maruthi2 extends Car2
{
	public void driving()
	{
		System.out.println("driving with maruthi caar...");
	}
	public void details()//this method is overridden
	{
		super.details();
		brandName="maruthi";
		carNo=1190;
		System.out.println("brand name: "+brandName+" car No is: "+carNo);
	}

	public static void main(String[] args) 
	{
//		 Car2 car2 = new Car2();
		//we can't create object for abstract class
		 Car2 car2 = new Maruthi2();
		car2.details();
		car2.driving();
		Maruthi2 maruthi2 = new Maruthi2();
		maruthi2.driving();
		maruthi2.details();
		
		
	
	}

}
