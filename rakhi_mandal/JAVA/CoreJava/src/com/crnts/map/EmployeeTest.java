//Write a program to use Employee object as a key in the HashMap.
package com.crnts.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest test =new EmployeeTest();
		test.entries();
	}
	public void entries()
	{
		HashMap<Employee, String> hash=new HashMap();
		hash.put(new Employee(1,34898.9), "Zoe");
		hash.put(new Employee(12,34008.29), "Abhi");
		hash.put(new Employee(3,34000.29), "Jack");
		hash.put(new Employee(22,24000.9), "Daniel");
		hash.put(new Employee(3,34000.29), "Jack");
		hash.put(new Employee(22,24000.9), "Daniel");
		hash.put(new Employee(12,24000.9), "Daniel");

		
//	   System.out.println(hash.entrySet());
//		------------------------------------------
		for(Employee key:hash.keySet())
		{
			String names=hash.get(key);
			
			System.out.println("Employees : "+key+" Names : "+names);
		}
	
//		-------------------------------------------
		
//		Iterator<Map.Entry<Employee,String >> show=hash.entrySet().iterator();
//		while(show.hasNext())
//		{
//			Map.Entry<Employee,String> entry=show.next();
//			Employee key=entry.getKey();
//			String names=entry.getValue();
//			System.out.println("Key : "+key+" Names : "+names);
//		}
	}

}
