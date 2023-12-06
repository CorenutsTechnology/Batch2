//Write program sort the Employee elements (keys) based on name or location from TreeMap
package com.crnts.map;

import java.util.TreeMap;

public  class TreeMapEmployeeTest {

	public static void main(String[] args) {
		TreeMapEmployeeTest test =new TreeMapEmployeeTest();
		test.showEmployees();
	}
	public void showEmployees()
	{
		 TreeMap<Employee_P6,Integer> map = new TreeMap<>();
		 map.put(new Employee_P6(1, "tom", "Developer","Pune"),101);
		 map.put(new Employee_P6(12, "jack", "Tester","Goa"),109);
		 map.put(new Employee_P6(4, "tom", "Developer","Delhi"),109);
		 map.put(new Employee_P6(8, "adam", "Developer","Pune"),101);
		 map.put(new Employee_P6(8, "neha", "Developer","Pune"),105);
		 map.put(new Employee_P6(8, "tom", "Developer","Pune"),109);
		
			
		 for (Employee_P6 key : map.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + map.get(key));
	        }
	}

}
