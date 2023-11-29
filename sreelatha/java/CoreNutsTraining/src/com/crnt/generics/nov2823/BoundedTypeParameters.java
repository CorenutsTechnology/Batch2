package com.crnt.generics.nov2823;

import java.util.ArrayList;

import com.crnt.nov07231.Employee;

public class BoundedTypeParameters {
	public <T extends Comparable<T>> void compare(T value1 , T value2)
	{
		System.out.println(value1.equals(value2));
	}
  public void display(ArrayList <? extends Comparable>  list)
  {
	  
	  for(Object obj : list)
	  {
		  System.out.println(obj);
	  }
  }
  public void display1(ArrayList <? super Integer>  list)
  {
	  
	  for(Object obj : list)
	  {
		  System.out.println(obj);
	  }
  }
public void display1(Employee employee) {
	// TODO Auto-generated method stub
	
}
public void display1(int i) {
	// TODO Auto-generated method stub
	
}

public static void main(String[] args) {
	BoundedTypeParameters bType= new BoundedTypeParameters();
	bType.compare(new Employee("sri" , 100), new Employee("latha",87));
	
	ArrayList<String> stringList= new ArrayList<>();
	stringList.add("Bengaluru");
	stringList.add("hyderabad");
	stringList.add("Delhi");
	bType.display(stringList);
	
	
	ArrayList<Number>integerList = new ArrayList<>();
	integerList.add(10);
	integerList.add(20);
	integerList.add(30);
	System.out.println(integerList);
	
	
	
}
}
