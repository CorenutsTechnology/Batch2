package december14.streams_Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import december13.streams_Student.Student;
import december13.streams_Student.StudentList;

public class Frequency {
	public static void main(String[] args) {
		List<Student> list = StudentList.createList();
		long count = list.stream().filter((e) -> e.getName().startsWith("J")).count();
		System.out.println(count);
		
		//frequency
		
//		list.stream().collect(Collectors.groupingBy(Student::getName)).entrySet().
//		forEach((e)->System.out.println(e.getKey() +" "+e.getValue().size()));
		
		list.stream().map((e)->e.getName()).sorted().forEach((e)->System.out.println(e));
		System.out.println("-------------------------");
		
		//descending order
		
//		list.stream().map((e)->e.getName()).sorted((o1,o2)->{
//			return -o1.compareTo(o2);
//		}).forEach((e)->System.out.println(e));;
		
		list.stream().map((e)->e.getName()).sorted(Comparator.reverseOrder()).forEach((e)->System.out.println(e));
	}
}
