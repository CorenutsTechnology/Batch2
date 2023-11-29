package com.crnt.assaignment.nov13;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :  ");
		int value=scan.nextInt();
		switch(value)
		{
		case 1: System.out.println("hyderabad");
		break;
		case 2 :System.out.println("vizag");
		break;
		case 3 :System.out.println("vijayawada");
		break;
		
		case 4 :System.out.println("banglore");
		}
	}

}
