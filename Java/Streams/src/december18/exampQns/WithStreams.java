package december18.exampQns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class WithStreams 
{
	public static void main(String[] args) 
	{
		List<Employees> empList = new ArrayList<>();
		empList.add(new Employees(100, "Suresh",1,1500000.0));
		empList.add(new Employees(101, "Alankar",1,2500000.0));
		empList.add(new Employees(201, "James",2,3500000.0));
		
		Comparator<Employees> cmp = (o1,o2)->{
			return - o1.getSalary().compareTo(o2.getSalary());
		};
		Collections.sort(empList,cmp);
		
		Map<Integer,List<Employees>> map = new HashMap<>();
		
		List<Employees> temp = null;
		for(Employees emp : empList)
		{
			if(!map.containsKey(emp.getDeptId()))
			{
				temp=new ArrayList<>();
				temp.add(emp);
				map.put(emp.getDeptId(), temp);
			}
		}
		
		for(Entry<Integer, List<Employees>> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" , "+ entry.getValue().get(entry.getValue().size()-1).getSalary());
		}
	}
}
