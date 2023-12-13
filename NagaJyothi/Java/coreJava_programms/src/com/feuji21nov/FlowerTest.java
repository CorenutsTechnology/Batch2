package com.feuji21nov;

public class FlowerTest 
{
	public static void main(String[] args) 
	{
		Flower f1=new Flower("white","lilli");
		//Flower ff=new Rose();
		//ff.flower();
		//ff.rose() //undefine type of error in compile time
		f1.flower();
		System.out.println(f1.colour);
		System.out.println(f1.fName);
		//f1.rose()//undefine type of error
		Rose f2=new Rose("Red","Rose");
		f2.flower();
		f2.rose();
		System.out.println(f2.colour);
		System.out.println(f2.fName);
		Jasmine j=new Jasmine("White","Jasmine");
		j.flower();
		j.jasmine();
		System.out.println(j.colour);
		System.out.println(j.fName);
		
		
	}

}
