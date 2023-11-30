package programming;

public class NonPrimeNumbers {
	
	public boolean nonPrime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c>0)
		{
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NonPrimeNumbers nonPrimeNumbers=new NonPrimeNumbers (); 
		System.out.println("1");
		for(int i=2;i<=100;i++)
		{
			if(nonPrimeNumbers.nonPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
