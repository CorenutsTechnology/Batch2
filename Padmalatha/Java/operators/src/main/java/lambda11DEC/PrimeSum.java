package lambda11DEC;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
public class PrimeSum {

	static void primeSum(Object o)
	{
		Integer k=(Integer)o;
		int sum=0;
		for(int i=2;i<=k;i++)
		{    int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==0)
			{
				sum+=i;
			}
		}
		
		System.out.println("Sum of prime numbers:"+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the range");
	    int n=scanner.nextInt();
	   // Consumer consumer= PrimeSum::primeSum;
	   // consumer.accept(10);
	   Function function=(a)->{
		   //consumer.accept(10);
		   PrimeSum.primeSum(a);
		   return 0;
	   };
	   function.apply(n);
	}
}
