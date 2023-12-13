package lambdaexpression08DEC;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class NameSorting {
	
	public static void main(String[] args) {
		TreeMap<Employee,Integer> map=new TreeMap<>((e,e1)->{
			Employee e2=(Employee)e;
			Employee e3=(Employee)e1;
			return e2.name.compareTo(e3.name);
		});
		
		map.put(new Employee(1,"jyothi","s/w",30000), 1);
		map.put(new Employee(2,"vani","s/w",30000), 2);
		map.put(new Employee(3,"akhila","s/w",30000), 3);
		map.put(new Employee(4,"swathi","s/w",30000), 4);
		map.put(new Employee(5,"bhanu","s/w",30000), 5);
		map.put(new Employee(6,"harika","s/w",30000), 6);
		
		for(Map.Entry<Employee,Integer> i:map.entrySet())
		{
			System.out.println(i.getKey()+"  :  "+i.getValue());
		}
		System.out.println("\n\n\n");
		
		//same for ArrayList
		LinkedList<Employee> list=new LinkedList();
		list.add(new Employee(1,"jyothi","s/w",30000));
		list.add(new Employee(2,"vani","s/w",30000));
		list.add(new Employee(3,"akhila","s/w",30000));
		Collections.sort(list,(e,e1)->{
			Employee e2=(Employee)e;
			Employee e3=(Employee)e1;
			return e2.name.compareTo(e3.name);
		});
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
		//TreeSet
		TreeSet<Employee> ts=new TreeSet((e,e1)->{
			Employee e2=(Employee)e;
			Employee e3=(Employee)e1;
			return e2.name.compareTo(e3.name);
		});
		ts.add(new Employee(1,"jyothi","s/w",30000));
		ts.add(new Employee(2,"vani","s/w",30000));
		ts.add(new Employee(3,"akhila","s/w",30000));
		/*
		 * for(Employee e:ts) { System.out.println(e); }
		 */
		ts.forEach(System.out::println);
	}

}
