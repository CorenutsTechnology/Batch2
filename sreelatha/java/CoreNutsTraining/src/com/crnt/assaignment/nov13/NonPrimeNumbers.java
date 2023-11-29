package com.crnt.assaignment.nov13;

public class NonPrimeNumbers {
	public static void main(String[] args) {
		NonPrimeNumbers nonPrimeNumbers = new NonPrimeNumbers();
		//nonPrimeNumbers.forLoop();
		//nonPrimeNumbers.whileLoop();
		nonPrimeNumbers.doWhileLoop();
	}
	public void forLoop()
	{
		for (int value = 0; value <= 100; value++) {
			int count =0;
			
			
				for (int index = 1; index <= value; index++) {
					if (value%index==0 ) {
						count++;
						
					}
					
					
				}
				if (count!=2) {
					System.out.println(value);
//					System.out.println("do you want continue press 1 ");
//					System.out.println("do you want stop press 0 ");
					
				}
				
			
			
		}
	}
	public void whileLoop()
	{
	int n=2;
	int primeCount=1;
	while (n<=100) {
		
		int count =0;
		for(int i=1; i<=n;i++)
		{
			if (n%i==0) {
				count++;
				
			}
		}
		if (count!=2) {
			
			System.out.println(n);
			
		}
		n++;
		
	}
	}
	public void doWhileLoop()
	{
		int n=2;
		int primeCount=1;
		do {
			
			int count =0;
			for(int i=1; i<=n;i++)
			{
				if (n%i==0) {
					count++;
					
				}
			}
			if (count!=2) {
				
				System.out.println(n);
				
			}
			n++;
			
		}while(n<=100);
		
	}

}
