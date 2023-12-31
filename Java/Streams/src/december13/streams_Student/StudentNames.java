//1.List names of the students from student records using streams?

package december13.streams_Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentNames 
{
	static List<Student> studentList = StudentList.createList();
	public static void main(String[] args) 
	{
		List<String> namesList = studentList.stream().map((e)->e.getName()).collect(Collectors.toList());
		namesList.forEach((e)->System.out.println(e));
	}
	
}
