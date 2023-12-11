package com.crnts.FuntionalInterface;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.crnts.List.User;


public class CheckEvenWithPredicete {
  public static void main(String[] args) {
	  CheckEvenWithPredicete check=new CheckEvenWithPredicete();
	  System.out.println("-----------Predicate-------------");
	  check.evenValues();
	  System.out.println("-----------BiConsumer-------------");
	  check.addValues();
	  System.out.println("-----------Supplier-------------");
	  check.printLoop();
	
}
  public void evenValues()
  {
	  Predicate<Integer> even=(num->{
		  if(num%2==0)
				return true;
				else
				  return false;
		  
	  });System.out.println(even.test(101));
  }
  public void addValues()
  {
	  BiConsumer<Integer,Integer> add=(num1,num2)->{
		  int result =num1+num2;
		  System.out.println(result);
			
	  };add.accept(10, 23);
  }
  
  public void printLoop()
  {
	  Supplier<Integer> loop=()->{
		  for(int index=0;index<=10;index++)
				{
					System.out.println(index);
					
				}
		  return 0;
		 
		
			
	  };loop.get();
	  }
//  public void compare()
//  {  
//	  Comparator<Integer> names=( o1, o2)->
//	  {
//		  
//	  
//	  
//  }
}
