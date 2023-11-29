package nov6Th;
import java.util.Scanner;

import nov7Th.Person;
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count value of the table");
		short count=sc.nextShort();
		System.out.println("enter the count value");
		int cont=sc.nextInt();
		for(int index1=1;index1<=count;index1++) {
			System.out.println("--------------------"); 
			for(int index2=1;index2<=cont;index2++) {
				System.out.println(index1+"X"+index2+"="+index1*index2);
			}
			
		}
		
		
	}

}
