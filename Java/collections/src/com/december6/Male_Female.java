package com.december6;
import java.util.*;
public class Male_Female 
{
	public void test()
	{
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101,"Ram",25000.0,"male"));
		list.add(new Employee(102,"Raj",35000.0,"male"));
		list.add(new Employee(103,"Seetha",45000.0,"female"));
		list.add(new Employee(104,"Rajini",55000.0,"female"));
		list.add(new Employee(105,"Sreenu",50000.0,"male"));
		Map<String,List<Employee>> map = new HashMap<>();
		map.put("male",list);
		List<Employee> maleList = new ArrayList<Employee>();
		List<Employee> femaleList = new ArrayList<Employee>();
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		Iterator<Employee> iterator2 = list.iterator();
		
		while(iterator.hasNext())
		{
			String str =iterator.next();
			
			while(iterator2.hasNext())
			{
				Employee empObj =iterator2.next();
				String gender = empObj.getGender();
				if(str.equals(gender))
				{
					maleList.add(empObj);
				}
			}
		}
		
		System.out.println(maleList);
		
	}
	public static void main(String[] args) {
		new Male_Female().test();
	}
}
