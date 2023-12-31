package december14.streams_Student;

import java.util.List;
import java.util.stream.Collectors;

import december13.streams_Student.Student;
import december13.streams_Student.StudentList;

public class Average 
{
	public static void main(String[] args) {
		List<Student> list=StudentList.createList();
		System.out.println(list.stream().collect(Collectors.averagingInt((e)->e.getId())));
		
	}
}
