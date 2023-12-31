package com.december6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Male_Female2
{
	public void method()
	{
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101,"Ram",25000.0,"male"));
		list.add(new Employee(102,"Raj",45000.0,"male"));
		list.add(new Employee(103,"Seetha",45000.0,"female"));
		list.add(new Employee(104,"Rajini",55000.0,"female"));
		list.add(new Employee(105,"Sreenu",50000.0,"male"));
		Map<String,List<Employee>> map = new HashMap<>();
		
		List<Employee> temp=null;
		for(Employee e:list)
		{
			if(map.containsKey(e.getGender()))
			{
				temp=map.get(e.getGender());
				temp.add(e);
				map.put(e.getGender(),temp);
			}
			else
			{
				temp=new ArrayList<>();
				temp.add(e);
				map.put(e.getGender(),temp);
			}
		}
		
		//printing map key and value
		Set<Entry<String ,List<Employee>>> set =map.entrySet();
		for(Entry<String ,List<Employee>> e : set)
		{
			System.out.println(e);
		}
//		
//		list.stream().collect(Collectors.groupingBy(Employee::getGender)).entrySet()
//		.forEach((e)->System.out.println(e.getKey()+"--"+e.getValue().size()));
		
		//for count of male and female
		
		Map<String,Integer> mapCount = new HashMap<>();
		int count=0;
		for(Employee e:list)
		{
			if(mapCount.containsKey(e.getGender()))
			{
				count=mapCount.get(e.getGender());
				count++;
				mapCount.put(e.getGender(),count);
			}
			else
			{
				mapCount.put(e.getGender(),1);
			}
		}
		for(Entry<String ,Integer> e : mapCount.entrySet())
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new Male_Female2().method();
	}
}
;