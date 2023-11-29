package com.ass.flowcontrol;

import java.util.Scanner;

public class OtpCreation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number for otp creation: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		OtpCreation.otpCreation(number);

	}

	public static int countDigit(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static void otpCreation(int number) {

		switch (countDigit(number)) {
		case 1:
			System.out.println("Genrated OTP: " + 0 + "" + 0 + "" + 0 + "" + number);
			break;
		case 2:
			System.out.println("Genrated OTP: " + 0 + "" + 0 + "" + number);
			break;
		case 3:
			System.out.println("Genrated OTP: " + 0 + "" + number);
			break;
		case 4:
			System.out.println("Genrated OTP: " + number);
			break;
		default:
			System.out.println("otp can only be created of 4 digits.");
			break;

		}
	}

}
