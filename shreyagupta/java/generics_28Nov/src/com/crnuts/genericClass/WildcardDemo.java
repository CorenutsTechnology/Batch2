package com.crnuts.genericClass;

import java.util.Arrays;
import java.util.List;

// --------upper Bounded Wildcards and Lower Bounded Wildcards---------

public class WildcardDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 4, 1, 3);
		List<Double> list2 = Arrays.asList(4.1, 6.12, 5.1);
		List<String> List3= Arrays.asList("java","html","css");
		List<Number> List4= Arrays.asList(5,6.6,32,1.7);
		
		
		
		System.out.println("total sum of Integer list: "+ totalSum(list1));
		System.out.println("total sum of Double list: "+ totalSum(list2)+"\n");
		
		System.out.println("Point Only Integer Class Or Super Class of Integer: ");
		pointOnlyIntegerClassOrSuperClass(List4);
		
		//pointOnlyIntegerClassOrSuperClass(List3);
		System.err.println("The method pointOnlyIntegerClassOrSuperClass(List<? super Integer>) "
				+ "in the type WildcardDemo is not applicable for the arguments (List<String>)");

	}
	
	//******upper Bounded Wildcards*******
	public static double totalSum(List<? extends Number> list) {
		double sum=0.0;
		for(Number i: list) {
			sum=sum+ i.doubleValue();
		}
		return sum;
	}
	
	//******Lower Bounded Wildcards*******
       public static void pointOnlyIntegerClassOrSuperClass(List<? super Integer> list) {
    	   System.out.println(list+"\n");
    	   
       }
}
