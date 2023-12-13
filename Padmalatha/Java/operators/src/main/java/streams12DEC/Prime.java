package streams12DEC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Prime {
	
	public static boolean isPrime(int n)
	{
		int c=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==1)
			return true;
		else
		   return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random(1000);
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i<30;i++)
       {
    	   list.add(random.nextInt());
       }
       List<Integer> prime=list.stream().filter(e->Prime.isPrime(e)).collect(Collectors.toList());
       prime.forEach(System.out::println);
		
	}

}
