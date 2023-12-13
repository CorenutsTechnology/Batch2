package com.org.flowcontrol10;

import java.util.Scanner;

public class ElectricityBill {
	public void electricityBillCalculate(int  units)
	{

     if(units<=50) {
	    System.out.println("bill is:250-minimum Usage");
     	}
	else if(units>=51&&units<=100)
	{
	int bill=250+(units*5);
	System.out.println("bill is:"+bill+"-moderate Usage");
	}
	else
	{
		int bill=250+(units*8);
		System.out.println("bill is:"+bill+"-High Usage");
	}

	}
}
