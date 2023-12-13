package mapinterface_5DEC;

import java.util.*;
import java.util.Map.Entry;
public class Employee {

	int id;
	String name;
	String designation;
	double salary;
	int experience;

	public Employee(int id, String name, String designation, double salary, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Employee,Integer> hm=new HashMap<Employee,Integer>();
      hm.put(new Employee(1,"sravs","Assosiate s/w",35000,1), 1);
      hm.put(new Employee(2,"chandrika","Assosiate s/w",35000,1), 2);
      hm.put(new Employee(3,"nani","java developer",45000,0), 3);
      Iterator iterator=hm.entrySet().iterator();
      while(iterator.hasNext())
      {
    	  Entry<Employee,Integer> entry=(Entry<Employee, Integer>) iterator.next();
    	  System.out.println("Employee: "+entry.getKey()+" Value"+entry.getValue());
      }
      
	}

}
