package Assignments;
import java .util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the consumed units");
		int ConsumedUnits=sc.nextInt();
		
		if( ConsumedUnits<=50) {
			System.out.println("Bill"+"="+250);
			
		}
		else if(ConsumedUnits<=100) {
			System.out.println("Bill"+"="+ConsumedUnits*+5);
		}
		
		else {
			System.out.println("Bill"+"="+ConsumedUnits*+8);
		}
	}

}
