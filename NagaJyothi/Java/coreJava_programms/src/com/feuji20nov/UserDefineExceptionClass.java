package com.feuji20nov;

import java.util.Scanner;

public class UserDefineExceptionClass extends RuntimeException implements UserDefineException {
	Scanner scan = new Scanner(System.in);

	public UserDefineExceptionClass() {
		super();
	}

	public UserDefineExceptionClass(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eligibleForVoting(int age) {
		// int age=scan.nextInt()

		if (age >= 18) {
			System.out.println("Eligible for voting ");
		}
		try {
			throw new UserDefineExceptionClass("user define");
		} catch (UserDefineExceptionClass e) {
			System.out.println("user define exception handled...");
		}

	}

	public static void main(String[] args) {
		UserDefineExceptionClass output = new UserDefineExceptionClass();
		/*
		 * System.out.println("Enter age"); int age=scan.nextInt()
		 */
		output.eligibleForVoting(2);
		

	}

}
