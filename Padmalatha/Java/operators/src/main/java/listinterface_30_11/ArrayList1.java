package listinterface_30_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ArrayList1 {
	
	// 1)write a program to convert an array to collection
	public List<Integer> toCollection(Integer a[]) {
		List<Integer> aL = Arrays.asList(a);
		return aL;

	}

	// 2)write a program to a convert collection to an array
	public Object[] toArray(List l) {
		return l.toArray();
	}
	
	//5)write a program to display student details
	public void displayStudents() {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("krishna",1,"CSE"));
		al.add(new Student("Radha",2,"Mech"));
		al.add(new Student("Balaram",3,"ECE"));
		al.add(new Student("rohini",4,"Civil"));
		
		System.out.println("----------------------------------");
		for(Student s:al)
		{
			System.out.println("Student name:"+s.name+"  id:"+s.id+" branch:"+s.branch);
		}
		System.out.println("-----------------------------------");
		
		System.out.println("\n\n----------------------------------");
		ListIterator<Student> li=al.listIterator();
		while(li.hasNext())
		{
			Student s=(Student)li.next();
			System.out.println("Student name:"+s.name+"  id:"+s.id+" branch:"+s.branch);
		}
		System.out.println("----------------------------------");
	}
	
	//Write a program to sort
	public void sortStudents() {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("krishna",1,"CSE"));
		al.add(new Student("Radha",2,"Mech"));
		al.add(new Student("Balaram",3,"ECE"));
		al.add(new Student("rohini",4,"Civil"));
		Collections.sort(al);
		System.out.println("\n\n----------------------------------");
		ListIterator<Student> li=al.listIterator();
		while(li.hasNext())
		{
			Student s=(Student)li.next();
			System.out.println("Student name:"+s.name+"  id:"+s.id+" branch:"+s.branch);
		}
		System.out.println("----------------------------------");
		
	}
}
