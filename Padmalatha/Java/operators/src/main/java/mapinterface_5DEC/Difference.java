package mapinterface_5DEC;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Map.Entry;

import org.apache.logging.log4j.CloseableThreadContext.Instance;
class Employee1 {

	int id;
	String name;
	String designation;
	double salary;
	int experience;
	
	public Employee1(int id, String name, String designation, double salary, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}


}
public class Difference{

	public static void main(String[] args) {
		HashMap<Integer,Employee1> hm=new HashMap<Integer,Employee1>();
		hm.put(1,new Employee1(1,"sravs","Assosiate s/w",35000,1));
		hm.put(2 ,new Employee1(2,"chandrika","Assosiate s/w",35000,1));
		hm.put(3, new Employee1(3,"nani","java developer",45000,0));
		Instant start=Instant.now();
		Iterator iterator=hm.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry<Integer,Employee> entry=(Entry<Integer, Employee>) iterator.next();
			System.out.println("Key:"+entry.getKey()+"value:"+entry.getValue());
		}
		Instant end=Instant.now();
		Duration time=Duration.between(start, end);
	    
		
		LinkedHashMap<Integer,Employee1> lhm=new LinkedHashMap<Integer,Employee1>();
		lhm.put(1,new Employee1(1,"sravs","Assosiate s/w",35000,1));
		lhm.put(2 ,new Employee1(2,"chandrika","Assosiate s/w",35000,1));
		lhm.put(3, new Employee1(3,"nani","java developer",45000,0));
		Instant start1=Instant.now();
		Iterator iterator1=hm.entrySet().iterator();
		while(iterator1.hasNext())
		{
			Entry<Integer,Employee> entry=(Entry<Integer, Employee>) iterator1.next();
			System.out.println("Key:"+entry.getKey()+"value:"+entry.getValue());
		}
		Instant end1=Instant.now();
		Duration time1=Duration.between(start1, end1);
		
	}
}
