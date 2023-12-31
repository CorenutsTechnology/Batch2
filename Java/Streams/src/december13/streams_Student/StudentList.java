package december13.streams_Student;
import java.util.*;
public class StudentList
{
	
	public static List<Student> createList()
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(210,"Ambika",'F',"ECE",515610,"Chittor","Andhra Pradesh"));
		list.add(new Student(215,"Vinod",'M',"Civil",515616,"Kochi","Tamilnadu"));
		list.add(new Student(211,"Anisha",'F',"CSE",515611,"Kanakapur","Delhi"));
		list.add(new Student(211,"Anisha",'F',"CSE",515611,"Kanakapur","Delhi"));
		list.add(new Student(212,"Jvarsha",'F',"Mech",515612,"Bhuvaneswar","Odisha"));
		list.add(new Student(213,"Mounika",'F',"Civil",515613,"karimnagar","Hyderabad"));
		list.add(new Student(214,"pravalika",'F',"CSE",515614,"Anantapur","Andhra Pradesh"));		
		list.add(new Student(215,"JSanjay",'M',"Mech",515615,"BTM","Banglore"));
		list.add(new Student(216,"Priya",'F',"Mech",515616,"BTM","Banglore"));
		list.add(new Student(217,"Manoj",'M',"Mech",515617,"Bommanahalli","Banglore"));
		list.add(new Student(217,"Manoj",'M',"Mech",515617,"Bommanahalli","Banglore"));
		

		return list;
	}
	
	
}
