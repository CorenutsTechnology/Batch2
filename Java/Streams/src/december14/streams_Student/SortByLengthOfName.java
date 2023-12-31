package december14.streams_Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import december13.streams_Student.Student;
import december13.streams_Student.StudentList;

public class SortByLengthOfName {
	public static void main(String[] args) {
		List<Student> list = StudentList.createList();

		list.stream().sorted((o1, o2) -> {
			return o1.getName().length() - o2.getName().length();
		}).forEach((e) -> System.out.println(e));
		
		
		System.out.println("------------------------------");

		List<Student> list3 = list.stream().sorted((o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		}).toList();
		System.out.println(list3);
		
	}
}
