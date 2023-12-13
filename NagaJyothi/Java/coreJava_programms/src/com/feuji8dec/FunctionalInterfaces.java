package com.feuji8dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FunctionalInterfaces 
{
	public static void main(String[] args)
	{
	  Predicate<Integer> predicate=(a)->{
		  if(a>18)
			  return true;
		  return false;
	  };
	  System.out.println(predicate.test(20));
	   BiFunction<Integer, Integer,Double> function=(a,b)->{
		   double res=a*b;
		   return  res;
	   };
	   System.out.println(function.apply(10, 20));
	   List<Employee> list=new ArrayList<>();
	   list.add(new Employee(1,"Jyothi",30000));
	   list.add(new Employee(2,"puri",40000));
	   list.add(new Employee(3,"PadmaLatha",40000));
	   
	    list.forEach((emp)->{
    	   System.out.println(emp);
       });
	}
		

}
