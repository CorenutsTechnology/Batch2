package com.collections.nov30;

import java.util.ArrayList;
import java.util.*;

public class Program1 {

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(10);
		list.add(12);
		list.add("hi");
		list.add("hlo");
		
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(list.get(i) instanceof Integer)
			{
				int a= (int) list.get(i);
				sum +=a;
			}
		}
		System.out.println(sum);
	}

}
