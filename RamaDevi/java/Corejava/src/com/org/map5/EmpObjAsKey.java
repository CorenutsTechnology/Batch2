package com.org.map5;

import java.util.HashMap;
import java.util.Map;

public class EmpObjAsKey {
	
public static void main(String[] args) {
	Map<Employee,String> map=new HashMap();
	map.put(new Employee("raj","bang"),"one");
	map.put(new Employee("raju","hyd"),"two");
	map.put(new Employee("raj","chennai"),"six");
	map.put(new Employee("dhanu","bang"),"five");
	map.put(new Employee("bhanu","delhi"),"seven");
	map.put(new Employee("raj","bang"),"one");
	for(Map.Entry<Employee,String> entr:map.entrySet())
	{
		System.out.println(entr.getKey()+","+entr.getValue());
	}
	
}

}
