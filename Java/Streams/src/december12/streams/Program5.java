//5. Find the maximum and minimum salary from the employee employeeList using streams?
package december12.streams;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program5 
{
	public static void main(String[] args)
	{
		List<Employees> employeeList = new ArrayList<>();
		employeeList.add(new Employees(201,"raju",1256));
		employeeList.add(new Employees(202,"kranthi",4456));
		employeeList.add(new Employees(203,"kiran",13256));
		employeeList.add(new Employees(204,"somu",100349));
		employeeList.add(new Employees(205,"rani",19356));
		
//		List<Employees> sortedList = employeeList.stream().sorted().collect(Collectors.toList());
//		System.out.println("Minimum salary is "+sortedList.get(0).getSalary());
//		System.out.println("maximum salary is "+sortedList.get(sortedList.size()-1).getSalary());
//		it is not working
		
		DoubleSummaryStatistics obj =  employeeList.stream().collect(Collectors.summarizingDouble(Employees::getSalary));
		System.out.println(obj.getMin());
		System.out.println(obj.getMax());
		
//		System.out.println( employeeList.stream().collect(Collectors.summarizingDouble(Employees::getSalary)).getMax());
	}
}
