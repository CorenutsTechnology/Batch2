package com.interfaceandabstract.nov16;

public class FruitImplementation implements Fruit4 , Mango
{
	public void details()
	{
		System.out.println("name: "+Mango.name+"color: "+Fruit4.color);
	}
}
