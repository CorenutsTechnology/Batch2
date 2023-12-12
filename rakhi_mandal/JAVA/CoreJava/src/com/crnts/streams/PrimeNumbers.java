//Create a new list of prime numbers from a list of random numbers (up to 1000) using streams?
package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumbers {

	public static void main(String[] args) {
		 ArrayList<Integer> arraylist=new ArrayList();
//	      ArrayList<Integer> primearraylist=new ArrayList();
	      Random r =new Random(); 
	      for(int index=0;index<1000;index++)
	      {   
	    	  arraylist.add(r.nextInt(1000));
	      }
	      //Printing values
	      arraylist.stream().filter(i->prime(i)).forEach((e)->System.out.println(e));
	      
	      
//	      --------------------------------------------------------------------
//	      arraylist.stream().filter(Predicate<Integer>).forEach((e)->System.out.println(e));
	      
	      
	      //adding the values to a list
//	       List<Integer> list = arraylist.stream().filter(i->prime(i)).collect(Collectors.toList());
//	       
//	       for( Integer print:list)
//	       {
//	    	   System.out.println(print);
//	       }
//	     

	}
	
	public static boolean prime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		return c == 2;
	}

}
