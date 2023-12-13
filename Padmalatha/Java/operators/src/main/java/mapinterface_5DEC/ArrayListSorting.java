package mapinterface_5DEC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import listinterface_30_11.Student;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
