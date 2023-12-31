package com.interfaceandabstract.nov16;

public class CalculateTest1 {

	public static void main(String[] args) 
	{
		Calculate1 calculateSubClass = new CalculateSubClass();
		calculateSubClass.calculate();//using first sub class
		
		//or we can also call using calculate reference
		
		CalculateSubClass object1 = new CalculateSubClass();
		object1.calculate();
		
		Calculate1 calculateSubClass2 = new CalculateSubClass2();
		calculateSubClass2.calculate();//using second sub class
		
		CalculateSubClass2 object2 = new CalculateSubClass2();
		object2.calculate();
	}

}
