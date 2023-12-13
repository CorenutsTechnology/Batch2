package com.org.programs14;

import java.util.Scanner;

public class FibanacciTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers upto do you want");
		int range=sc.nextInt();
		FibanacciNumber fianaccinumber=new FibanacciNumber();
		fianaccinumber.fibancci(range);

	}

}
