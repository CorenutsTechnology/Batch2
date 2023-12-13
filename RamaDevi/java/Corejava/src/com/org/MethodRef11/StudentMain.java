package com.org.MethodRef11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.org.map5.IdComparator;



public class StudentMain {

	public static void main(String[] args) {
	
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram"));
		stulist.add(new Student(5,"rama"));
		stulist.add(new Student(3,"anu"));
		stulist.add(new Student(2,"hari"));
		
		Student st=new Student();
		IdComparator idCom= new IdComparator();
		Comparator com=(o1,o2)->
		{
				if(((Student) o1).getId()>((Student) o2).getId())
					return 1;
				if(((Student) o1).getId()<((Student) o2).getId())
					return -1;
				else
					return 0;

		};
		
		Collections.sort(stulist,com);
		for(Student stud:stulist)
		{
			System.out.println(stud.getId()+" "+stud.getName());
		}

	}

}
