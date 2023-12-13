package com.org.stream12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyClass {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		
		Random r=new Random();
		for(int i=0;i<1000;i++)
		{
			list.add(r.nextInt());
		}
		Long tim1=System.currentTimeMillis();
		System.out.println(tim1);
		List<Integer> evenlist=new ArrayList();
	
		int evensum=0;
		for(int j=0;j<list.size();j++)
		{
			if(list.get(j)%2==0)
			{
				evenlist.add(list.get(j));
				evensum+=list.get(j);
			}
		}
		System.out.println("evensum"+evensum);
		System.out.println(evenlist.size());
		Long tim2=System.currentTimeMillis();
		System.out.println(tim2);
		System.out.println(tim2-tim1);
		Long tim3=System.currentTimeMillis();
		int sum=list.stream().filter((i)->i%2==0).reduce(0, (a,b)->a+b);
		Long tim4=System.currentTimeMillis();
		System.out.println(sum);
		
		
		
	}

}
