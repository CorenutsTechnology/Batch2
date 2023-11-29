package com.cnts.nov21;


class Vehicle2
{
	String brand;
	
	public Vehicle2(String brand)
	{
		this.brand=brand;
	}
	
	public void display()
	{
		System.out.println("Brand: "+brand);
	}
}

class TwoWheeler extends Vehicle2
{

	public TwoWheeler(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
}

class Activa extends TwoWheeler
{

	public Activa(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

}


public class Multilevel8 {

}
