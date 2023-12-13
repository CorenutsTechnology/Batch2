package com.org.exception20;

import java.util.Scanner;

public class UserCUTryBlock implements Vote {
	public static void main(String[] args) {
		UserCUTryBlock user = new UserCUTryBlock();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
			user.age(age);
		} catch (ProperAgeException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

	
	public void age(int age) throws ProperAgeException {
		if (age < 18) {
			throw new ProperAgeException();
		}

	}

}
