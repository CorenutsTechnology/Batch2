package december14.streams_Student;

import java.util.List;

import december13.streams_Student.Student;
import december13.streams_Student.StudentList;

public class OnlyGirls 
{
	public static void main(String[] args) {
		List<Student> list=StudentList.createList();
		list.stream().filter((e)->e.getGender().equals('F')).forEach((e)->System.out.println(e));
	}
}
