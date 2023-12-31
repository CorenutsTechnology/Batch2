package december8.interfaces;

import java.util.function.Supplier;
import java.util.*;

public class SupplierInterface
{
	
	public static void main(String[] args) 
	{
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(121,"Pravalika",89.9));
		list.add(new Student(122,"Gowri",86.9));
		list.add(new Student(123,"Rubeena",87.9));
		list.add(new Student(124,"Ambika",83.9));
		list.add(new Student(121,"Pravalika",89.9));
		
		//if name is equal to pravalika then send that record
		Supplier<Student> supplier = ()->{ 
				Student st=null;
			for(Student student:list)
			{
				if(student.getName().equals("Pravalika"))
					st= student;
				
			}
			return st;
		};
		
		Student st = supplier.get();
		System.out.println(st);
	}
}
