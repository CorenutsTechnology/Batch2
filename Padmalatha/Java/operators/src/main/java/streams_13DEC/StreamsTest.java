package streams_13DEC;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"krishna","cse","M","Hyderabad","Telangana"));
		studentList.add(new Student(2,"radha","cse","F","Chennai","Tamilnadu"));
		studentList.add(new Student(3,"balaram","ece","M","Hyderabad","Telangana"));
		studentList.add(new Student(4,"rohini","eee","F","Coimbatore","Tamilnadu"));
		studentList.add(new Student(5,"yeshodha","cse","F","Vishakapatnam","AndraPradesh"));
		studentList.add(new Student(6,"nandha","ece","M","Vishakapatnam","AndraPradesh"));
		studentList.add(new Student(7,"vasudevaki","mech","F","Chennai","Tamilnadu"));
		studentList.add(new Student(8,"Arjun","mech","M","Nandyal","AndraPradesh"));
		studentList.add(new Student(9,"subhdrha","mech","F","Nandyal","AndraPradesh"));
		
		
		System.out.println("------------------------1-------------------------");
		studentList.stream().map(e->e.getName()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("\n\n------------------------2-------------------------");
		studentList.stream().collect(Collectors.groupingBy(Student::getGender)).entrySet().forEach(e->System.out.println(e.getKey()+" : "+e.getValue().size()));;
		
		System.out.println("\n\n------------------------3-------------------------");
		studentList.stream().filter(e->(e.getBranch().equals("cse"))).collect(Collectors.groupingBy(Student::getBranch)).entrySet().forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));;
	
		System.out.println("\n\n------------------------4-------------------------");
		studentList.stream().collect(Collectors.groupingBy(Student::getBranch)).entrySet().forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));;
	    
		System.out.println("\n\n------------------------5-------------------------");
		studentList.stream().filter(e->(e.getBranch().equals("mech"))).filter(e->(e.getGender().equals("F"))).forEach(e->System.out.println(e));
		
		System.out.println("\n\n------------------------6-------------------------");
		studentList.stream().collect(Collectors.groupingBy(Student::getState,Collectors.groupingBy(Student::getCity)))
		.entrySet().forEach(e->{System.out.println(e.getKey());e.getValue().entrySet().forEach(e1->System.out.println(e1.getKey()+" ="+e1.getValue().size()));});
	}

}
