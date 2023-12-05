package com.crnts.constructors.assigmentD23;

import java.util.Scanner;

public class Program1Child {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Program1Child program1Child = new Program1Child();
//		program1Child.display();
		program1Child.display1();
	}

	public void display() {
		System.out.println("Enter the input : ");
		String input = sc.nextLine();
		boolean flag = false;
		Program1 program1 = new Program1(input);

		if (input != "") {
			flag = true;
			System.out.println("Given name is : " + program1.name);
		}
		if (!flag) {
			System.out.println("Unknown");

		}

	}

	void display1() {
		System.out.println("Enter the input : ");
		String input = sc.nextLine();

		Program1 program2 = new Program1();

		System.out.println("name   :" + program2.name);
	}

}
