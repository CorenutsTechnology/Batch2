package december11.lambdaExpressions;

public class Program1 
{
	public static void main(String[] args) 
	{
		Interface1 object= (num)->{
			int count=0;
			if(num<=1)
				return false;
			for(int i=2;i<(num/2);i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==0)
				return true;
			else {
				return false;
			}
		};
		
		System.out.println(object.isPrime(7));
		
	}
}
