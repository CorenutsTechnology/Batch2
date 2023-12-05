//06-11-23
package tables;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number upto which table is needed");
		int number=sc.nextInt();
		System.out.println("Enter the number range for which table is needed");
		int number1=sc.nextInt();
	for(int index=1;index<=number;index++)
		{
			for(int index1=1;index1<=number1;index1++)
			{
				System.out.println(index+"x"+index1+"="+index*index1);
			}
		}

		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please enter valid integer value "+e.getMessage());
		}
		

	}

}
