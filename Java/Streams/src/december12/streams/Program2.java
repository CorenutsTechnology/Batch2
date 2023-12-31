//2. Create a list of employees and print all records using streams?

package december12.streams;

import java.util.ArrayList;
import java.util.List;

public class Program2 
{
	public static void main(String[] args) 
	{
		List<Employees> list = new ArrayList<>();
		list.add(new Employees(201,"raju",123456));
		list.add(new Employees(202,"kranthi",124456));
		list.add(new Employees(203,"kiran",123256));
		list.add(new Employees(204,"somu",123496));
		list.add(new Employees(205,"rani",193456));
		
		list.forEach((e)->System.out.println(e));
	}
}
