//4.Names of the students categorized by department using streams?

package december13.streams_Student;

import java.util.List;
import java.util.stream.Collectors;

public class NamesOfStudentByDept 
{
	public static void main(String[] args)
	{
		List<Student> list=StudentList.createList();
		
		
		list.stream().collect(Collectors.groupingBy(Student::getDept)).entrySet().forEach((e)->{
			System.out.println("Dept: "+e.getKey()+" Names: ");
			e.getValue().forEach((value)->{	

				System.out.println("                "+value.getName());
			});
		});
		
	}	
}
