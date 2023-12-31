	//2.Write a program to  show count of male and female students from the student records using streams?
package december13.streams_Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountofMaleAndFemale 
{
	public static void main(String[] args) {
		List<Student> list=StudentList.createList();
		
		 list.stream().collect(Collectors.groupingBy((e)->e.getGender())).entrySet().forEach((e)->{
			 System.out.println(e.getKey()+"----"+e.getValue().size());
		 });
		 
//		 map.entrySet().forEach((e)->{
//			 System.out.println(e.getKey()+"----"+e.getValue().size());
//		 });
	}
}
