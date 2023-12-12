package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamClass {

	public static void main(String[] args) {
      ArrayList<Integer> arraylist=new ArrayList();
      ArrayList<Integer> evenarraylist=new ArrayList();
      Random r =new Random(); 
      for(int index=0;index<100000;index++)
      {   
    	  arraylist.add(r.nextInt());
      }
      long time = System.currentTimeMillis();
//      System.out.println("Starting time--"+time);
      long sum=0;
      for(int index=0;index<100000;index++)
      {   if(arraylist.get(index)%2==0)
    	  sum=sum+(arraylist.get(index));
      }
      System.out.println("sum : "+sum);
//      System.out.println(evenarraylist.size());
      
      long endtime = System.currentTimeMillis();
//      System.out.println("Ending time--"+endtime);
      System.out.println("Time taken");
      System.out.println(endtime-time);
      
      
//      ------------------------------------------------------------
      long timenew = System.currentTimeMillis();
//      System.out.println("Starting time--"+timenew);
      Integer newlist = arraylist.stream().filter(i->i%2==0).reduce(0,(a,b)->a+b); //sum
      System.out.println("Sum :"+newlist);
//      System.out.println(newlist.size());
      long timenew2 = System.currentTimeMillis();
//      System.out.println("Ending time--"+timenew2);
      System.out.println("Time taken");
      System.out.println(timenew2-timenew);
    	  
      
      
	}

}
