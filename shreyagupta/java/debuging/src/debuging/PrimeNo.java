package debuging;

import java.util.Scanner;

public class PrimeNo {

public	static boolean isPrime(int n) {
	if(n<=1) {
		System.out.println("not a prime no");
	}
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				c++;
			}
		}
		return c==2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
	    if(isPrime(n)){
	    	System.out.println("prime no");
	    }
	    else {
	    	System.out.println("not a prime no");
	    }


	}

}
