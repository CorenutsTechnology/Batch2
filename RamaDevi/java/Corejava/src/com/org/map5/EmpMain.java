package com.org.map5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class EmpMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList();
		list.add(new Employee("bhanu", "hyd"));
		list.add(new Employee("hari", "chennai"));
		list.add(new Employee("dharu", "hyd"));
		list.add(new Employee("krithi", "delhi"));
		list.add(new Employee("jaya", "mumbai"));

		// Collections.sort(list, new LocationCompare());
		//lambda for the location compare
		
		Comparator c1=(l1,l2)->
		{
			return ((Employee) l1).getLocation().compareTo(((Employee) l2).getLocation());
		};
		Collections.sort(list,c1);
		
		//lambda for name Comparator
		Comparator c=(o1, o2)-> {
			return ((Employee) o1).getName().compareTo(((Employee) o2).getName());
		};
		Collections.sort(list,c);


		for (Employee emp : list) {
			System.out.println(emp.getName() + "," + emp.getLocation());

		}

//		Map<Employee,String> empMap=new HashMap();
//		empMap.put(new Employee("bhanu", "hyd"),"2");
//		empMap.put(new Employee("hari", "chennai"),"3");
//		empMap.put(new Employee("dharu", "hyd"),"4");
//		empMap.put(new Employee("krithi", "delhi"),"2");
//		empMap.put(new Employee("jaya", "mumbai"),"1");	
//		
//		Iterator<Map.Entry<Employee,String>> emp=empMap.entrySet().iterator();
//		while(emp.hasNext())
//		{
//			Map.Entry<Employee, String> e=emp.next();
//			System.out.println(e);
//		}

	}

}
