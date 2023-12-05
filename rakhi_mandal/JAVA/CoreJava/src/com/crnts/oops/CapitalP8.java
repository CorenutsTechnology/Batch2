package com.crnts.oops;

public class CapitalP8 extends StateP8{
	String capitalName="bbsr";
	int pincode=750017;
	
	static CapitalP8 capitalP8=new CapitalP8();
	

	public static void main(String[] args) {
		capitalP8.display();
	}
	void display()
	{
		System.out.println(capitalP8.capitalName);
		System.out.println(capitalP8.pincode);
		System.out.println(capitalP8.countryName);
		System.out.println(capitalP8.numOfStates);
		System.out.println(capitalP8.GSTstateCode);
	}

}
