package day_10_11_23_Assignment;

import java.util.Scanner;

public class ElectricityBill {

	public void bill(int numberOfUnits) {
		if(numberOfUnits<=50) {
			System.out.println("Rs 250 - Minimum Usage");
		}
		else if(numberOfUnits>=51 && numberOfUnits<=100) {
			System.out.println("Rs "+numberOfUnits*5+" - Moderate Usage");
		}
		else {
			System.out.println("Rs "+numberOfUnits*8+" - High Usage");
		}
	}
	
	public static void main(String[] args) {
		ElectricityBill electricityBill=new ElectricityBill();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of Units ");
		int numberOfUnits=sc.nextInt();
		electricityBill.bill(numberOfUnits);
	}

}
