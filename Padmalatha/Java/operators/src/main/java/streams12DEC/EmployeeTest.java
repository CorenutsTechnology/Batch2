package streams12DEC;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.*;
public class EmployeeTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"krishna",48000));
		list.add(new Employee(2,"Radha",45000));
		list.add(new Employee(3,"BalaRama",40000));
		list.add(new Employee(4,"Rohini",35000));
		list.add(new Employee(5,"Nandha",25000));
		list.add(new Employee(6,"Yashodha",45000));
		list.add(new Employee(7,"Vasudev",5000));
		
		System.out.println("-------------1---------------");
		System.out.println("No.of Records");
		//1)Question
		System.out.println(list.stream().count());
		System.out.println("----------------------------");
		
		Stream s=  list.stream();
		s.forEach((e)->System.out.println(e));
		
		System.out.println("--------------2--------------");
		System.out.println("Printing Records");
		//2)Question
		list.stream().forEach(System.out::println);
		System.out.println("----------------------------");
		
		System.out.println("-------------3---------------");
		System.out.println("Employees earning salary greater than 15000");
		//4)Question
		List<Employee> list1=list.stream().filter(e->(e.salary>=15000)).collect(Collectors.toList());
		list1.stream().forEach(System.out::println);
		System.out.println("----------------------------");
		System.out.println("------------4----------------");
		System.out.println("Max-Min");
		DoubleSummaryStatistics ds=list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	     System.out.println("Max Salary"+ds.getMax());
	     System.out.println("Min Salary"+ds.getMin());
		System.out.println("----------------------------");
		

		Class c=s.getClass();
		
		Method[] m=c.getMethods();
		for(Method i:m)
		{
			System.out.println(i);
		}
		
		
	}

}
