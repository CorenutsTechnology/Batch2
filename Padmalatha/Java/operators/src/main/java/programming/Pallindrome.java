package programming;

import java.util.Scanner;

public class Pallindrome {

	public boolean isPallindrome(int n)
	{
		int k=n,rev=0,r;
		while(k>0)
		{
			r=k%10;
			rev=(rev*10)+r;
			k/=10;
		}
		if(rev==n)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		Pallindrome pallindrome=new Pallindrome();
		if(pallindrome.isPallindrome(num))
		{
			System.out.println(num+" is a pallindrome");
		}
		else
		{
			System.out.println(num+" is not a pallindrome");
		}

	}

}
