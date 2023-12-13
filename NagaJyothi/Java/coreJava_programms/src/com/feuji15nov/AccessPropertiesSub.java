package com.feuji15nov;

public class AccessPropertiesSub extends Accessproperties
{
	public void accessMethod()
	{
		System.out.println(value3);
		System.out.println(value4);
		publicMethod();
	}
	
	public static void main(String[] args)
	{
		AccessPropertiesSub properties=new AccessPropertiesSub();
		properties.accessMethod();
		Accessproperties propertiesObject=new Accessproperties();
		System.out.println("value1 through object:"+propertiesObject.value1);
		System.out.println("value3 through object:"+propertiesObject.value3);
		System.out.println("value4 through object:"+propertiesObject.value4);



		
		
		
	}
}
