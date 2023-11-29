package com.ass.flowcontrol;

public class ElectricityBill {

	public static void main(String[] args) {
		ElectricityBill electricityBill = new ElectricityBill();
		electricityBill.unitConsumed(66);

	}

	public void unitConsumed(int unitConsumed) {
		switch (unitConsumed) {
		case 1:
			if (unitConsumed > 0 && unitConsumed <= 50) {
				System.out.println("cost of electricity bill (Minimum Usage) : RS 250");
				break;
			}
		case 2:
			if (unitConsumed >= 51 && unitConsumed <= 100) {
				System.out.println("cost of electricity bill is Rs 5 per unit - Moderate Usage: " + (unitConsumed * 5));
				break;
			}
		default:
			System.out.println("cost of electricity bill is Rs 8 per unit - High Usage: " + (unitConsumed * 8));

		}
	}

}
