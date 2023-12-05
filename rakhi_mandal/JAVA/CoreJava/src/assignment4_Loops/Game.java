package assignment4_Loops;

import java.util.Scanner;

public class Game {
     static int result=0;
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of groups participating: ");
		int groups=sc.nextInt();
		for(int index=1;index<=groups;index++)
		{
			for(int index1=1;index1<=5;index1++)
			{
				System.out.println("Did the ball dropped ? :1.Yes 2.No");
				sc.nextLine();
				String ball=sc.nextLine();
				switch(ball)
				{
				case "yes":{fail(0);
				            break;}
				
				case "No":success(1);
				}
			}
			System.out.println(result);
		}
	}
	public static void success(int n)
	{
		result=+1;
	}
	public static void fail(int n)
	
	{
		result=+0;
	}

}
