package december14.streams_Student;

import java.util.List;

import december13.streams_Student.Student;
import december13.streams_Student.StudentList;

public class LocateMaleStudentsOfNameJ
{
	public static void main(String[] args)
	{
		List<Student> list=StudentList.createList();
		
		list.stream().filter((e)->e.getName().startsWith("J")).filter((e)->e.getGender()=='M').
		forEach((e)->System.out.println(e.getAddress()+" "+e.getCity()+" "+e.getState()));
	}
}
 