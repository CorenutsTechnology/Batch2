package com.org.flowcontrol10;

import java.util.Scanner;

public class ElectricityBillMain {

	public static void main(String[] args) {
		ElectricityBill electricityBill=new ElectricityBill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of units consumed");
		int noOfUnits=sc.nextInt();
		electricityBill.electricityBillCalculate(noOfUnits);
		

	}

}
