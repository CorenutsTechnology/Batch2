//Write program sort the Employee elements based on name or location from ArrayList
package com.crnts.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EmployeeName_Location {

public static void main(String[] args) {
	EmployeeName_Location show=new EmployeeName_Location();
	show.showEmployees();
		
	}
	public void showEmployees()
	{
		 List<Employee_P6> list = new ArrayList<>();
		 list.add(new Employee_P6(1, "tom", "Developer","Pune"));
		 list.add(new Employee_P6(12, "jack", "Tester","Goa"));
		 list.add(new Employee_P6(4, "tom", "Developer","Delhi"));
		 list.add(new Employee_P6(8, "tom", "Developer","Pune"));
		 list.add(new Employee_P6(8, "tom", "Developer","Pune"));
		 list.add(new Employee_P6(8, "tom", "Developer","Pune"));
		 Collections.sort(list);
			
			Iterator<Employee_P6> iterator = list.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next()+" ");
			}
	}
}
