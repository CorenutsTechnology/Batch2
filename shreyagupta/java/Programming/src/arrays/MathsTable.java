package arrays;

import java.util.*;

public class MathsTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("table should start from:");
			int start=sc.nextInt();
			
			System.out.println("table should end in:");
			int end=sc.nextInt();
			
			System.out.println("enter number should multiply by 1 to where:");
			int num=sc.nextInt();

			for(int numtable=start;numtable<=end;numtable++) {
				for(int multiplyby=1;multiplyby<=num;multiplyby++) {
					System.out.println(numtable+"*"+multiplyby+"="+numtable*multiplyby+" ");
				}
				System.out.println("=======================");

			}
			
		}catch(InputMismatchException exp) {
			System.out.println("*****enter the number within int range*****");
		}







	}

}
