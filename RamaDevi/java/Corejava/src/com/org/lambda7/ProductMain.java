package com.org.lambda7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		List <Product> empList=new ArrayList();
		empList.add(new Product(1,"tv"));
		empList.add(new Product(2,"AC"));
		empList.add(new Product(3,"Cooler"));
		empList.add(new Product(4,"Iron"));
		//System.out.println(empList);
//		for(Product product:empList)
//		{
//			System.out.println(product);
//		}
//		
		Comparator<Product> p=(o1,o2)->
		{
			return  o1.getName().compareTo(o2.getName());
		};
		Collections.sort(empList,p);
		for(Product product:empList)
		{
			System.out.println(product);
		}
	}

}
