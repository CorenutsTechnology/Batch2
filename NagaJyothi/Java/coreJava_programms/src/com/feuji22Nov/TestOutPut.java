package com.feuji22Nov;

public class TestOutPut 
{
	public static void main(String[] args) 
	{
		
		Bike object=new Bike("bullet",2);
		System.out.println(object.wheels);
		TwoWheelarClass t1=new TwoWheelarClass("KTM",new Bike("hero"));
		//System.out.println("...."+t1);
		System.out.println(t1.getType());
		System.out.println("Object"+t1.getObject());
		Vehicle v1=new Vehicle("car",t1);
		System.out.println(v1.getType());
		System.out.println(v1.getObject());
		
		
		
		
	}

}
