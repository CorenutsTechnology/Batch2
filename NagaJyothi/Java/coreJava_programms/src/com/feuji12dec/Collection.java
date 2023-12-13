package com.feuji12dec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Collection 
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
     		int sum=0;
		Random random=new Random();
		for(int i=0;i<=100000;i++)
		{
			list.add(random.nextInt());
		}
		List<Integer> evenList=new ArrayList<>();
		long time1=System.currentTimeMillis();
		//System.out.println(time1);
		for(int i=0;i<=list.size()-1;i++)
		{
			if(list.get(i)%2==0)
				{
				evenList.add(i);
				sum=sum+list.get(i);
				}
		}
        //System.out.println(evenList.size());
        System.out.println("sum:"+sum);
        long time2=System.currentTimeMillis();
		//System.out.println(time2);
		System.out.println(time2-time1);
		
		long time3=System.currentTimeMillis();
		//System.out.println("start time:"+time3);
		int res=list.stream().filter((i)->i%2==0).reduce(0,(a,b)->a+b);
        System.out.println(res);
        long time4=System.currentTimeMillis();
		//System.out.println("end time:"+time4);
		System.out.println(time4-time3);
		
	}

}
