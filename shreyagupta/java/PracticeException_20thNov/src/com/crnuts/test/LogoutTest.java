package com.crnuts.test;

import java.util.Scanner;

public class LogoutTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] eid = new int[5];
		int option;
		System.out.println("Enter employee ID");

		for (option = 0; option < eid.length; option++) {
			eid[option] = scanner.nextInt();
			scanner.nextLine();
		}
		
		System.out.println("Enter the option:");
		switch (option) {
		case 1:
			System.out.println("Employee id: " + eid[0] + " logout time " + java.time.LocalDateTime.now());
			break;
		case 2:
			System.out.println("Employee id: " + eid[1] + " logout time " + java.time.LocalDateTime.now());
			break;
		case 3:
			System.out.println("Employee id: " + eid[2] + " logout time " + java.time.LocalDateTime.now());
			break;
		case 4:
			System.out.println("Employee id: " + eid[3] + " logout time " + java.time.LocalDateTime.now());
			break;
		case 5:
			System.out.println("Employee id: " + eid[4] + " logout time " + java.time.LocalDateTime.now());
			break;
		default:
			System.out.println("Invalid Employee ID.");
			break;
		}

	}

}
