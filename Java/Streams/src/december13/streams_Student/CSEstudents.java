//3.Write a program to list students who come under the CSE department using streams?

package december13.streams_Student;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSEstudents 
{
	public static void main(String[] args)
	{
		List<Student> list=StudentList.createList();
//		
//		list.stream().collect(Collectors.groupingBy((e)-> e.getDept())).entrySet().forEach((e)->{
//			if(e.getKey().equals("CSE"))
//				System.out.println(e.getValue());			
//		});
		
		//another way
		Stream<Entry<String, List<Student>>> stream =	list.stream().collect(Collectors.groupingBy((e)-> e.getDept())).
				entrySet().stream().filter((e)->{
			return e.getKey().equals("CSE");
		});
		
//		stream.forEach((e)->System.out.println(e.getValue()));
		
		List<Student> list2=	list.stream().filter((e)->e.getDept().equals("CSE")).toList();
	System.out.println(list2);	
	}
}

