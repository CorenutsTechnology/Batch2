//6.Write a program to show State, City wise student count using streams?

package december13.streams_Student;

import java.util.List;
import java.util.stream.Collectors;

public class ListByStateAndCity 
{
	public static void main(String[] args)
	{
		List<Student> list=StudentList.createList();
		
		list.stream().collect(Collectors.groupingBy(Student::getState)).entrySet().stream().forEach((e)->{
			System.out.println("state: "+e.getKey());
			e.getValue().stream().collect(Collectors.groupingBy(Student::getCity)).entrySet().stream().
			forEach((e2)->{
				System.out.print("	city: "+e2.getKey());
				System.out.println(" count: "+e2.getValue().size());
			});
		});
		
	}
}
