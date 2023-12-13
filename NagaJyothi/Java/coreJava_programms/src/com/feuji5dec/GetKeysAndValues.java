package com.feuji5dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.feuji4dec.Product;

public class GetKeysAndValues
{
	public void displayValues(Map<Integer, Product> map)
	{
		map.put(1, new Product("oneplus", 20000));
		map.put(2, new Product("Mi", 15000));
		map.put(3, new Product("Oppo", 17000));
		map.put(4, new Product("Vivo", 20000));
		 System.out.println(map.entrySet());
		 Iterator<Entry<Integer, Product>> iterator=map.entrySet().iterator();
		 while(iterator.hasNext())
		 {
			 Entry<Integer,Product> entry=(Entry<Integer,Product> )iterator.next();
			 Product p=entry.getValue();
			 System.out.println("product value:"+p.getCompany()+""+p.getPrice());
			 //System.out.println(entry.getValue());
			 //System.out.println(iterator.next());
		 }
	}
   public static void main(String[] args) 
   {
	   GetKeysAndValues result=new GetKeysAndValues();
	   Map<Integer, Product> map=new HashMap<>();
	   result.displayValues(map);
	
   }
}
