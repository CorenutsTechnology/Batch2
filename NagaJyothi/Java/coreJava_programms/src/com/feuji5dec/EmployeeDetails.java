package com.feuji5dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.feuji4dec.Product;

public class EmployeeDetails 
{
	public void displaydetails(Map<Employee, Product> map)
	{
	 map.put(new Employee(1, "Jyothi", 40000, "JavaDeveloper"), new Product("Oneplus", 20000));
	 map.put(new Employee(2, "Indu", 30000, "ASE"), new Product("Oppo", 17000));
	 map.put(new Employee(3, "Puri", 50000, "pythonDeveloper"), new Product("iphone13Pro", 100000));
	 //System.out.println(map);
	 Iterator iterator= map.entrySet().iterator();
	 while(iterator.hasNext())
	 {
		 System.out.println(iterator.next());
	 }
	}
	
	public static void main(String[] args) 
	{
		EmployeeDetails details=new EmployeeDetails();
		Map<Employee, Product> map=new  HashMap<>();
		details.displaydetails(map);
		
    		
	}

}
