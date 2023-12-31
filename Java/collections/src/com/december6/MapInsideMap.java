package com.december6;
import java.util.*;
import java.util.Map.Entry;
public class MapInsideMap
{
	public void method()
	{
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2("Pravali","IT","Banglore"));
		list.add(new Employee2("Chandu","NIT","Hyderabad"));
		list.add(new Employee2("Ambika","NIT","Banglore"));
		list.add(new Employee2("Gowri","IT","Hyderabad"));
		list.add(new Employee2("Rubeena","NIT","mysore"));
		list.add(new Employee2("Rubeena","NIT","Banglore"));
		
		
		Map<String,Map<String,List<Employee2>>> map = new HashMap<>();
		
		Map<String,List<Employee2>> innerMap=null;
		List<Employee2> subList=null;
		for(Employee2 e: list)
		{
			if(map.containsKey(e.getLocation()))
			{
				innerMap=map.get(e.getLocation());
				if(innerMap.containsKey(e.getDept()))
				{
					subList=innerMap.get(e.getDept());
					subList.add(e);
					innerMap.put(e.getDept(),subList);
				}
				else
				{
					subList=new ArrayList<>();
					subList.add(e);
					innerMap.put(e.getDept(),subList);
				}
			}
			else
			{
				subList=new ArrayList<>();
				subList.add(e);
				innerMap = new HashMap<>();
				innerMap.put(e.getDept(),subList);
				map.put(e.getLocation(),innerMap);
			}
		}
				
		for(Entry<String, Map<String, List<Employee2>>> e : map.entrySet())
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) 
	{
		new MapInsideMap().method();
	}
}
