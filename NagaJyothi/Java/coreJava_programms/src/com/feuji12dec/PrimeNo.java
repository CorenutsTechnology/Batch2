package com.feuji12dec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrimeNo {
//	public   boolean checkPrimeNo(int num)
//	{
//		int count=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//			return true;
//		else
//			return false;
//				
		
	//}
	public static void main(String[] args) {
		PrimeNo prime=new PrimeNo();
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i <= 1000; i++) {
			list.add(random.nextInt());
			
		}
		//System.out.println(list);
		
//		list.stream().filter((e)->)
//		Predicate<Integer> predicate=prime::checkPrimeNo;
//        boolean b=predicate.test(6);
//        System.out.println(b);
        Predicate<Integer> predicate1=(e->{
        	for(int i=1;i<=e;i++)
        	{
        		if(e%i==0)
        		return true;
        	}
        	return false;
        });
       System.out.println( predicate1.test(5));
        
       
        
        
		//list.stream().map((e)->PrimeNo.checkPrimeNo(e)).collect(Collectors.toList()).forEach((e)->System.out.println(e));	

	}

}
