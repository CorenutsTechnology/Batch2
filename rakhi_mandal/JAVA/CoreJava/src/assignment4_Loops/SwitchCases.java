package assignment4_Loops;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the month name:");
		String month=sc.nextLine();
		for(int index=1;index<5;index++)
		{
		switch(month)
		{
		case "jan":System.out.println("It is january month");break;
		case "feb":System.out.println("It is february month");break;
		case "mar":System.out.println("It is march month");break;
		case "april":System.out.println("It is april month");break;
		default: System.out.println("Enter valid month name");
		}
		
	}
	}

}
