package asslgntment3_Loops;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		ElectricityBill electricityBill =new ElectricityBill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount of unit ussage:");
		electricityBill.billIfElse(sc.nextFloat());
		
	}
	public float billIfElse( float amount) {
		if(amount>=1 && amount<=50)
			System.out.println(" Your Bill : Rs.250/- \n Ussage : Minimum");
		else if(amount>=51 && amount<=100)
			System.out.println(" Your Bill : Rs."+ amount*5+"/-"+"\n Ussage : Moderate");
		else if(amount>101)
			System.out.println(" Your Bill : Rs."+ amount*8+"/-"+"\n Ussage : High");
		
		else
			System.out.println("Enter valid unit ussage");
	
		return amount;
			
	}

}
