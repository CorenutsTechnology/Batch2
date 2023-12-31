//4. Create a new list of employees.Find whose salary is greater than 10000 from the list of employee records?
package december12.streams;

import java.util.ArrayList;
import java.util.List;

public class Program4 
{
	public static void main(String[] args) 
	{
		List<Employees> list = new ArrayList<>();
		list.add(new Employees(201,"raju",1256));
		list.add(new Employees(202,"kranthi",4456));
		list.add(new Employees(203,"kiran",13256));
		list.add(new Employees(204,"somu",103496));
		list.add(new Employees(205,"rani",19356));
		
		List<Employees> result = list.stream().filter((e)->{
			if(e.getSalary() > 10000)
				return true;
			else
				return false;
		}).toList();
		
		result.forEach((e)->System.out.println(e));
		
		
		list.stream().filter((e)->e.getSalary()>10000).forEach((e)->System.out.println(e));
	}
}
