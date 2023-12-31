//3. Create a new list of prime numbers from a list of random numbers (up to 1000) using streams?
package december12.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Program3 
{
	public static boolean isPrime(int num)
	{
		if(num<=3)
			return false;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("heloo");
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for(int j=0;j<20;j++)
		{
			list.add(r.nextInt(100));
		}
		List<Integer> list2 =list.stream().filter((num)->{
				
		if(num <=3)
			return false;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;}).collect(Collectors.toList());
		System.out.println(list2);
		
		//or
		List<Integer> list3 = list.stream().filter(Program3::isPrime).toList();
		System.out.println(list3);
		
	}
}
