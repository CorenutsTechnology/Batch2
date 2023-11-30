package day_06_11_23;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table number");
	try {
		int tablenumber=sc.nextInt();
		System.out.println("enter number");
		int number=sc.nextInt();
			for(int index1=1;index1<=tablenumber;index1++) {
				System.out.println("table "+index1+" is");
					for(int index2=1;index2<=number;index2++) {
						System.out.println(index1+"x"+index2+"="+(index1*index2));
				}
				System.out.println();
			}
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("enter valid integer value "+e.getMessage());
	}
	}

}
