package december8.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortStudent2
{
	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(121,"Pravalika",89.9));
		list.add(new Student(122,"Gowri",86.9));
		list.add(new Student(123,"Rubeena",87.9));
		list.add(new Student(124,"Ambika",83.9));
		list.add(new Student(121,"Pravalika",89.9));
		
		//without extra class which is for implementing a  comparable  interface
		
		Comparator<Student> cmp = (obj1,obj2)->
		{
			return obj1.getName().compareTo(obj2.getName());		
		};
		
		Collections.sort(list,cmp);
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
