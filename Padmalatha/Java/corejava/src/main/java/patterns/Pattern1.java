package patterns;

import java.util.Scanner;

/*
 
      *
    * * *
  * * * * *
* * * * * * *

*/
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=scanner.nextInt(),sp=n;
		int k=n*2-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				if(j<=sp-i||j>sp+i)
				{
					System.out.print("  ");
				}
				else
					System.out.println("* ");
			}
			sp--;
			System.out.println();
		}

	}

}
