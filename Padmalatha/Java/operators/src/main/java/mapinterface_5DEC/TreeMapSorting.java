package mapinterface_5DEC;

import java.util.*;
import java.util.Map.Entry;
public class TreeMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeMap<Employee,Integer> tm=new TreeMap<Employee,Integer>(new NameSortingCom());
       tm.put(new Employee(1,"sravs","Assosiate s/w",35000,1), 1);
       tm.put(new Employee(2,"chandrika","Assosiate s/w",35000,1), 2);
       tm.put(new Employee(3,"nani","java developer",45000,0), 3);
       Iterator iterator=tm.entrySet().iterator();
       while(iterator.hasNext())
       {
     	  Entry<Employee,Integer> entry=(Entry<Employee, Integer>) iterator.next();
     	  System.out.println("Employee: "+entry.getKey()+" Value"+entry.getValue());
       }
		
	}

}
